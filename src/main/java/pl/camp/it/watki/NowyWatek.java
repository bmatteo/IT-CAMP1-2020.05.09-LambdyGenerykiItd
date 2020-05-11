package pl.camp.it.watki;

public class NowyWatek implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Watek runnable: " + i);
        }
    }
}
