package pl.camp.it;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;
import pl.camp.it.model.ArgumnetsWrapper;
import pl.camp.it.model.Car;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("BMW", 200));
        carList.add(new Car("Audi", 220));
        carList.add(new Car("Toyota", 150));
        carList.add(new Car("Renault", 170));

        System.out.println(carList);

        Collections.sort(carList, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println(carList);

        Collections.sort(carList, (c1, c2) -> c2.getPrice() - c1.getPrice());

        System.out.println(carList);

        Comparator<Car> comparatorSamochodow = (c1, c2) -> -c1.getBrand().compareTo(c2.getBrand());

        Collections.sort(carList, comparatorSamochodow);

        System.out.println(carList);

        Function<Integer, Integer> funkcja = x -> x*3;
        Function<Integer, Car> carProducer = x -> new Car("NEW", x);

        System.out.println(funkcja.apply(4));

        System.out.println(carProducer.apply(900));

        Supplier<Car> innyDostawcaSamochodow =
                () -> new Car("New", new Random().nextInt(1000));

        System.out.println(innyDostawcaSamochodow.get());

        BiFunction<Car, Car, Integer> porownywaczAut = (c1, c2) -> c1.getPrice() - c2.getPrice();

        UnaryOperator<Integer> funkkcjaUnarna = x -> x*4;

        IntUnaryOperator funkcjaUnarnaInteger = x -> x*4;

        Predicate<Car> BMWChecker = x -> x.getBrand().equals("BMW");

        System.out.println(BMWChecker.test(new Car("BMW", 100)));

        Consumer<Car> zjadaczAut = System.out::println;

        zjadaczAut.accept(new Car("Toyota", 150));

        Consumer<Car> zaawansowanyZjadaczSamochodow = car -> {
            car.setBrand("BRAND: " + car.getBrand());
            car.setPrice(car.getPrice()*1000);
            System.out.println(car);
        };

        zaawansowanyZjadaczSamochodow.accept(new Car("Mercedes", 300));

        //Button button = new Button();
        //button.addEventHandler(EventType.ROOT, x -> System.out.println("Kliknięto przycisk !!"));

        Consumer<Car> konsumer = Main::drukuj;

        konsumer.accept(new Car("Audi", 300));
    }

    public static void drukuj(Car car) {
        System.out.println("hello ! cena wynosi: " + car.getPrice());
    }
}
