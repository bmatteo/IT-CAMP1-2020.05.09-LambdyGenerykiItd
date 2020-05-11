package pl.camp.it.watki;

public class PierwszyWatek extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Wątek: " + i);
        }
    }
}
