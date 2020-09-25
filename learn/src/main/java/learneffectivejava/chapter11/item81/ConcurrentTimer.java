package learneffectivejava.chapter11.item81;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 * Create by peng on 2020/9/24.
 */
public class ConcurrentTimer {
    private ConcurrentTimer() {
    }

    public static long time(Executor executor, int concurrency,
                            Runnable action) throws InterruptedException{
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(concurrency);

        for (int i = 0; i < concurrency; i++){
            executor.execute(() -> {
                ready.countDown();
                try {
                    start.await();
                    action.run();
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();
                }
            });
        }

        ready.await();                        //等待所有线程就位
        long startNanos = System.nanoTime();  //线程就位后会将ready-1，当为0的时候就会放开ready执行
        start.countDown();                    //所有线程就位后会等待start,放开start
        done.await();                         //所有线程开启后，等待执行任务完成后把done做完
        return System.nanoTime() - startNanos;

    }
}
