package demo.annotations;

import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {
        Stream.of(Shop.class.getAnnotations()).forEach(System.out::println);
    }
}