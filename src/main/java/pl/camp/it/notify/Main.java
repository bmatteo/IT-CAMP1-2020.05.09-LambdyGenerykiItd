package pl.camp.it.notify;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final Object lock = new Object();
    public static boolean flag = false;

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Odbieracz(), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Wysylacz(), 1, TimeUnit.SECONDS);
        {}

        scheduledExecutorService.shutdown();
    }
}
