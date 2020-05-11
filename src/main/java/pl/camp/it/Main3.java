package pl.camp.it;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);

        list = list.stream().filter(x -> x%2==0).collect(Collectors.toList());

        System.out.println(list);

        list = list.stream().limit(5).collect(Collectors.toList());

        System.out.println(list);
    }
}
