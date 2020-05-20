package pl.camp.it.notify2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CommunicationLine communicationLine = new CommunicationLine();

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(
                new IncreaserConsumer(communicationLine, 100),
                0,
                TimeUnit.SECONDS);

        for (int i = 0; i < 100; i++) {
            scheduledExecutorService
                    .schedule(new Increaser(communicationLine), 1, TimeUnit.SECONDS);
        }

        scheduledExecutorService.shutdown();
    }
}
