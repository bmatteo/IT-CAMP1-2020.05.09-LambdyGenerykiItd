package pl.camp.it.watki;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main2 {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10000; i++) {
            executor.submit(Main2::countIncreaser);
        }
        executor.shutdown();
        while (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("Still waiting ...");
        }

        System.out.println("Wynik wynosi: " + count);
    }

    synchronized public static void countIncreaser() {
        System.out.println(count);
        count = count + 1;
    }
}
