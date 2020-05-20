package pl.camp.it.wildcards;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Figura figura = new Figura();
        Kolo kolo = new Kolo();
        Kwadrat kwadrat = new Kwadrat();
        Prostokat prostokat = new Prostokat();

        Figura figura1 = method(figura);
        method(new Object());
        method(kolo);
        method(kwadrat);
        method(prostokat);

        method2(new Figura());
        method2(new Kolo());
        method2(new Prostokat());
        method2(new Kwadrat());

        //method2(new Object());
        //method2(new String("asdf"));

        method3(new FigureBox<Prostokat>());
        method3(new FigureBox<Kwadrat>());
        //method3(new FigureBox<Figura>());

        method4(new FigureBox<JakasImplementacja>());
        //method4(new FigureBox<Object>());

        method5(new FigureBox<Prostokat>());
        method5(new FigureBox<Figura>());
        method5(new FigureBox<Object>());
        //method5(new FigureBox<Kwadrat>());
        //method5(new FigureBox<String>());
    }

    public static <T> T method(T object) {
        //cos robi
        return object;
    }

    public static <T extends Figura> T method2(T object) {
        return object;
    }

    public static FigureBox method3(FigureBox<? extends Prostokat> object) {
        return object;
    }

    public static FigureBox method4(FigureBox<? extends JakisInterfejs> object) {
        return object;
    }

    public static FigureBox method5(FigureBox<? super Prostokat> object) {
        return object;
    }
}
