package pl.camp.it.watki2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        Runnable watek = () -> {
            for(int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };

        scheduledExecutorService.schedule(watek, 1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
