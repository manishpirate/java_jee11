package demo.Stream.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {


    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
        listString.add("Five");
        Optional<String> result = listString.stream().reduce((s1, s2) -> s1 + ","+ s2 );
        System.out.println(result.orElse("no-data"));

        String resultval = listString.stream().reduce("", (s1,s2)-> s1 + "," + s2);
        System.out.println("resultval = " + resultval);
        
    }

}
