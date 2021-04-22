package demo.Lambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        DoubleFunction<Double> doubleFunction = r -> r+r;
        BiFunction<Integer, Integer, String> biFunction = (x, y) -> String.valueOf(x) +  String.valueOf(y);
        BiPredicate<Integer, Integer> byPredicate = (x,y) -> x==y;

        System.out.println(byPredicate.test(3,4));
        System.out.println(doubleFunction.apply(3));
        System.out.println(biFunction.apply(3,4));

        //checking consumer
        Consumer<String> consumer = x -> System.out.println("x = " + x);

        consumer.accept("Hello Brother");

        Supplier<String> stringSupplier = () -> "Hey Buddy";

        System.out.println(stringSupplier.get());

        //Calling sub string from method refrence and BiFunction
        String city = "New Delhi";
        BiFunction<Integer, Integer, String> labdaSubString = (x,y) -> city.substring(x,y);

        System.out.println(labdaSubString.apply(2,3));

        var list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("manish sharma");

        var c = list.stream().filter(p -> p.length()>10).count();


        var set1 = new HashSet<String>();
        set1.add("Hello");
        var list1 = new ArrayList<String>();
        var dequq = new ArrayDeque<String>();
        dequq.push("world");


    }

}
