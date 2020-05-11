package pl.camp.it.generyki;

public class Kolo extends Figura {
    @Override
    public double wyliczObwod() {
        double r = Math.sqrt(this.getPole()/Math.PI);
        return 2*Math.PI*r;
    }

    @Override
    public double wyliczPole() {
        double r = this.getObwod()/(2*Math.PI);
        return Math.PI*r*r;
    }
}
