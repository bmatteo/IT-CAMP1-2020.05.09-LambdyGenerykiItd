package pl.camp.it.notify;

public class Odbieracz implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Odbieracz czeka !!");
                while (!Main.flag) {
                    System.out.println("Czekam !!");
                    Main.lock.wait();
                }
                System.out.println("Odbieracz odebrał !!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
