package demo.Stream.Base;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamIntOperations {

    public static void main(String[] args) {

        String[] colorNames = {"Red", "Green", "Blue", "Black"};
        long count = Arrays.stream(colorNames).filter(s -> s.contains("r")).count();
        System.out.println("count is = " + count);

        int sum = Arrays.stream(colorNames).mapToInt(s -> s.length()).sum();
        System.out.println("sum is = " + sum);

        //now we will find average which returns the OptionalDouble
        OptionalDouble averageVariable = Arrays.stream(colorNames).mapToInt(s -> s.length()).average();
        double result = averageVariable.orElse(1.0D);
        System.out.println("result is = " + result);

        Optional<String> maxString = Arrays.stream(colorNames).max((s1, s2) -> s1.compareTo(s2));
        System.out.println(maxString.orElse("no-max value"));
    }
}
