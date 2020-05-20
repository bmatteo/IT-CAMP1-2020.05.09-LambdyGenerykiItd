package pl.camp.it.wildcards;

public class FigureBox<T> {
    T figura;

    public T getFigura() {
        return figura;
    }

    public void setFigura(T figura) {
        this.figura = figura;
    }
}
