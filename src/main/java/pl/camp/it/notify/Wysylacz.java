package pl.camp.it.notify;

public class Wysylacz implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Wysylacz cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysylacz wciaz cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysylacz dalej cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysylacz wyslal !!");
                Main.flag = true;
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
