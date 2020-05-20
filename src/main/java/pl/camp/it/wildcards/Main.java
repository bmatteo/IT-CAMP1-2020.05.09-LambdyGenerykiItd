package pl.camp.it.wildcards;

public class Main {
    public static void main(String[] args) {
        Figura f = new Kolo();

        //FigureBox<Figura> kbox = new FigureBox<Kolo>();

        /*FigureBox<Kwadrat> pudelkoNaKwadrat = new FigureBox<>();
        FigureBox<Kolo> pudelkoNaKolo = new FigureBox<>();
        FigureBox<Prostokat> pudelkoNaProstokat = new FigureBox<>();*/


        FigureBox<?> pudelko = new FigureBox<>();
        pudelko.figura = null;
        //pudelko.figura = new Kolo();

        pudelko = metoda();
        System.out.println(pudelko.figura);
    }

    public static FigureBox<Kwadrat> metoda() {
        //to przychodzi z metody (pudelko2)
        FigureBox<Kwadrat> pudelko2 = new FigureBox<>();
        pudelko2.setFigura(new Kwadrat());
        return pudelko2;
    }
}
