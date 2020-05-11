package pl.camp.it.generyki;

public class FigureBox<T extends Figura> {
    T figure;

    public FigureBox(T figure) {
        this.figure = figure;
    }

    public double wyliczSumeObwoduIPola() {
        return figure.getObwod() + figure.getPole();
    }

    @Override
    public String toString() {
        return "FigureBox{" +
                "figure=" + figure +
                '}';
    }
}
