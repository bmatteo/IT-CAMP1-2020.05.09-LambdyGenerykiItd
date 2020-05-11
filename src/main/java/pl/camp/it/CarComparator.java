package pl.camp.it;

import pl.camp.it.model.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
