package pl.camp.it.generyki;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista;

        ExampleGenericClass<String, NonGenericClass> obiektGeneryczny = new ExampleGenericClass<>(5, "ABC");

        System.out.println(obiektGeneryczny.getObject());

        obiektGeneryczny.setObject("sadfg");

        System.out.println(obiektGeneryczny.getObject());

        obiektGeneryczny.getObject().toUpperCase();

        NonGenericClass nonGenericClass = new NonGenericClass(5, "ABC");

        System.out.println(nonGenericClass.getObject());

        nonGenericClass.setObject("usdfygl");

        System.out.println(nonGenericClass.getObject());

        nonGenericClass.setObject(true);

        if(nonGenericClass.getObject() instanceof String) {
            System.out.println("jestesmy w ifie !!");
            //nonGenericClass.getObject().toUpperCase();
            ((String) nonGenericClass.getObject()).toUpperCase();
        }

        ExampleGenericClass<String, NonGenericClass> obiektDwa =
                new ExampleGenericClass<>(6, "String", new NonGenericClass(5, 5));
    }
}
