package demo.Stream.Base;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class BasicStreamOperations {

    public static void main(String[] args) {
        Stream.of("B", "C","A","E","D","F")
                .takeWhile(s-> !s.equals("D")).dropWhile(s -> !s.equals("C")).limit(2).forEach(System.out::println);
        String [] colorNames = {"RED","GREEN", "YELLOW"};
        String [] noColorArrays = {};
        boolean result = Arrays.stream(colorNames).anyMatch(s -> s.contains("EE"));
        System.out.println("result = " + result);
        result = Arrays.stream(colorNames).allMatch(s -> s.contains("E"));
        System.out.println("result = " + result);
        result = Arrays.stream(colorNames).noneMatch(s -> s.contains("E"));
        System.out.println("result = " + result);
        Optional<String> resultOptional = Arrays.stream(noColorArrays).findAny();
        String anyColor = resultOptional.isPresent() ? resultOptional.get() : "No-color";
        System.out.println("anyColor = " + anyColor);

        Optional<String> resultOptionalFirstColor = Arrays.stream(colorNames).findFirst();
        String resultOptionalFirst = resultOptionalFirstColor.isPresent() ? resultOptionalFirstColor.get() : "No-color";
        System.out.println("first color = " + resultOptionalFirst);

    }
}
