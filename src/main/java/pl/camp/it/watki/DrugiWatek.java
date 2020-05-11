package pl.camp.it.watki;

public class DrugiWatek extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Drugi watek:" + i);
        }
    }
}
