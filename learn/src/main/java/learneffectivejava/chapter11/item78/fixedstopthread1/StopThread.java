package learneffectivejava.chapter11.item78.fixedstopthread1;

import learneffectivejava.chapter4.item16.Time;

import java.util.concurrent.TimeUnit;

/**
 * Create by peng on 2020/9/22.
 */
public class StopThread {
    private static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested())
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }


}
