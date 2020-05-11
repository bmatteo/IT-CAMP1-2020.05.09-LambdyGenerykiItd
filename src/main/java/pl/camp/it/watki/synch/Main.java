package pl.camp.it.watki.synch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 100000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.getValue());
    }

}

class Counter {
    private int value;

    public synchronized void increment() {
        value = value + 1;
    }

    public int getValue() {
        return this.value;
    }
}
