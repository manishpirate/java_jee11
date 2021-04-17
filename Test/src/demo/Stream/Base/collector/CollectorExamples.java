package demo.Stream.Base.collector;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

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
    }
}
