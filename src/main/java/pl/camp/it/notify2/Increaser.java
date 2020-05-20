package pl.camp.it.notify2;

public class Increaser implements Runnable {

    CommunicationLine communicationLine;

    public Increaser(CommunicationLine communicationLine) {
        this.communicationLine = communicationLine;
    }

    @Override
    public void run() {
        synchronized (this.communicationLine) {
            this.communicationLine.counter++;
            System.out.println("Wątek inkrementuje: " + this.communicationLine.counter);
            this.communicationLine.threadsDone++;
            this.communicationLine.notifyAll();
        }
    }
}
