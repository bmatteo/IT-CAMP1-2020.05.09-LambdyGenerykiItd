package pl.camp.it.generyki;

public abstract class Figura {
    private double pole;
    private double obwod;

    abstract public double wyliczObwod();
    abstract public double wyliczPole();

    public final double getPole() {
        return pole;
    }

    public final void setPole(double pole) {
        if(pole <= 0) {
            throw new IllegalArgumentException();
        }
        this.pole = pole;
        this.obwod = this.wyliczObwod();
    }

    public final double getObwod() {
        return obwod;
    }

    public final void setObwod(double obwod) {
        if(obwod <= 0) {
            throw new IllegalArgumentException();
        }
        this.obwod = obwod;
        this.pole = this.wyliczPole();
    }
}
