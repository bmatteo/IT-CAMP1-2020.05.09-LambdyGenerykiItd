package pl.camp.it.watki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PierwszyWatek watek = new PierwszyWatek();
        DrugiWatek watek2 = new DrugiWatek();
        Thread nowyWatek = new Thread(new NowyWatek());
        Thread nowyWatek2 = new Thread(() -> System.out.println("dzieje się !"));
        Thread nowyWatek3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("dzieje się !");
            }
        });

        //watek.start();
        //watek2.start();
        //nowyWatek.start();

        //watek.join();
        //watek2.join();
        //nowyWatek.join();

        //ExecutorService executorDoRaportow = Executors.newSingleThreadExecutor();
        //executorDoRaportow.submit(watek);
        //executorDoRaportow.submit(watek2);
        //executorDoRaportow.submit(nowyWatek);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(watek);
        executorService.submit(watek2);
        executorService.submit(nowyWatek);

        executorService.shutdown();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main: " + i);
        }
    }
}
