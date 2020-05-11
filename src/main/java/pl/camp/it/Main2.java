package pl.camp.it;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,7,8,9,11,14);

        /*for (Integer liczba : list) {
            if(liczba%2==0) {
                System.out.println(liczba);
            }
        }*/

        /*
        Metoda z klasami anonimowymi

        Predicate<Integer> OddPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        Consumer<Integer> wypisywacz = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.stream()
                .filter(OddPredicate)
                .forEach(wypisywacz);*/

        Predicate<Integer> odd = x -> x%2==0;
        List<Double> przefiltorwanaLista = list.stream()
                .filter(odd)
                .filter(x -> x>5)
                .filter(x -> x<10)
                .map(Integer::doubleValue)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(przefiltorwanaLista);

        IntStream intStream = IntStream.iterate(4, x -> x*x-1);
        intStream
                .forEach(System.out::println);

    }
}
