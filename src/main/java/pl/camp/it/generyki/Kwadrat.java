package pl.camp.it.generyki;

public class Kwadrat extends Figura {

    @Override
    public double wyliczObwod() {
        double a = Math.sqrt(this.getPole());
        return 4*a;
    }

    @Override
    public double wyliczPole() {
        double a = this.getObwod()/4;
        return a*a;
    }
}
