package pl.camp.it;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class Main4 {
    public static void main(String[] args) {
        //Integer i = 5;
        //i = null;

        Optional<Integer> oi = Optional.empty();

        if(oi.isPresent()) {
            oi.get().toString();
        } else {
            System.out.println("Nie ma inta !!");
        }

        Optional<Integer> oi2 = Optional.of(5);

        if(oi2.isPresent()) {
            System.out.println(oi2.get().toString());
        }

        Integer i = null;

        if(i != null) {
            System.out.println(i.toString());
        }

        Optional<Integer> number = getNumberFromDatabase();

        if(number.isPresent()) {
            number.get().compareTo(6);
        }

        Optional<Integer> nullOptional = Optional.ofNullable(null);

        System.out.println(nullOptional.isPresent());

        Supplier<Integer> dostawcaLiczb = () -> 6;

        System.out.println(number.orElse(8));
        System.out.println(number.orElseGet(dostawcaLiczb));

        System.out.println(number.map(x -> x+5).orElse(10));

        number.orElseThrow(RuntimeException::new);
    }


    private static Optional<Integer> getNumberFromDatabase() {
        return Optional.empty();
    }
}
