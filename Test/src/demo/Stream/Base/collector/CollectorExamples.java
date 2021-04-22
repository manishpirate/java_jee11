package demo.Stream.Base.collector;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExamples {

    public static void main(String[] args)   {
        List<String> listString = new ArrayList<>();
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
        listString.add("Five");

        DoubleSummaryStatistics stats = listString.stream().collect(Collectors.summarizingDouble(s -> (s.length())));
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());

       String resultVal  = listString.stream().collect(Collectors.mapping(s -> s + " bye ", Collectors.joining(", ")));
        System.out.println(resultVal);

       Map<Integer,Integer> result = listString.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.summingInt(s -> s.length())));
      for(Map.Entry<Integer, Integer> entry : result.entrySet()){
           System.out.println("---------------------");
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
           System.out.println("---------------------");
       }

        Map<Boolean, List<String>> result1 = listString.stream().collect(
                Collectors.partitioningBy(s -> s.length()>4));
      
        Long s = listString.stream().collect(Collectors.counting());
        System.out.println("s = " + s);

        for(Map.Entry<Boolean, List<String>> entry : result1.entrySet()){
            System.out.println("---------------------");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("---------------------");
        }
    }
}
