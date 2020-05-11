package pl.camp.it.generyki;

import javafx.util.Pair;

public class Main2 {
    public static void main(String[] args) {
        Kolo k = new Kolo();
        k.setPole(36);
        FigureBox<Kolo> box = new FigureBox<>(k);

        System.out.println(box.wyliczSumeObwoduIPola());

        Kwadrat kw = new Kwadrat();
        kw.setPole(81);
        FigureBox<Kwadrat> box2 = new FigureBox<>(kw);

        //FigureBox<Integer> box3;

        System.out.println(box2.wyliczSumeObwoduIPola());

        Pair<Kolo, Kwadrat> kolo = Main2.metodaGeneryczna(new Kolo(), new Kwadrat());
    }

    public static <T, R> Pair<T, R> metodaGeneryczna(T parametr, R parametr2) {
        Pair<T,R> para = new Pair<>(parametr, parametr2);
        return para;
    }

    //public static <R, T> R metodaGeneryczna2(T parametr) {

    //}
}
