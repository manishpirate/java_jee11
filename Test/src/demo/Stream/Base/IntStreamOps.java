package demo.Stream.Base;

import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamOps {
    public static void main(String[] args) {
        //this is how to create an integer stream
        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9);
        double average = intStream.average().getAsDouble();
        System.out.println("average = " + average);

        //Stream
        Stream<String> s = Stream.of("Hello","World","I", "am","here");
        s.filter( p -> p.length()>2).forEach(System.out::println);

        //DoubleStream
        DoubleStream doubleStream = DoubleStream.generate( ()-> Math.random()*5).limit(5);
        //doubleStream.forEach(System.out::println);
        System.out.println(doubleStream.average());

    }
}
