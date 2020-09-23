package learneffectivejava.chapter11.item78.fixedstopthread2;

import java.util.concurrent.TimeUnit;

/**
 * Create by peng on 2020/9/22.
 */
// Cooperative thread termination with a volatile field
public class StopThread {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)
                i++;
            System.out.println(i);
        });
        backgroundThread.start();

        TimeUnit.MICROSECONDS.sleep(200);
        //TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
