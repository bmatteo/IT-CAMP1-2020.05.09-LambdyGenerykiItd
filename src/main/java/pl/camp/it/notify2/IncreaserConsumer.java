package pl.camp.it.notify2;

public class IncreaserConsumer implements Runnable {

    CommunicationLine communicationLine;
    int increaserThreads;

    public IncreaserConsumer(CommunicationLine communicationLine, int increaserThreads) {
        this.communicationLine = communicationLine;
        this.increaserThreads = increaserThreads;
    }

    @Override
    public void run() {
        synchronized (this.communicationLine) {
            System.out.println("Konsumer zaczyna !!");

            while (increaserThreads != 0) {
                try {
                    this.communicationLine.wait();
                    while (this.communicationLine.threadsDone > 0) {
                        this.increaserThreads--;
                        this.communicationLine.threadsDone--;
                    }
                    System.out.println("Pozostało " + this.increaserThreads + "wątków !!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Wynik zwięksania: " + this.communicationLine.counter);
        }
    }
}
