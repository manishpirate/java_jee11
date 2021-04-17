package demo.Stream.Base.collector;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {
        Product p1 = new Product("Maggi", 23.05d, LocalDate.now().minusDays(2));
        Product p2 = new Product("Chips", 20d, LocalDate.now().minusDays(1));
        Product p3 = new Product("Coke", 10d, LocalDate.now().plusDays(2));
        Product p4 = new Product("Burger", 40d, LocalDate.now().plusDays(1));
        Product p5 = new Product("Momos", 60, LocalDate.now());
        Product p6 = new Product("Chocos", 32, LocalDate.now());

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        //we will reduce the list and group by dates
        Map<LocalDate, List<Product>> output =  productList.stream().collect(Collectors.groupingBy(p -> p.getBestBeforeDate()));
        for(Map.Entry<LocalDate,List<Product>> value : output.entrySet()){
            System.out.println("key is = " + value.getKey() + " Value is " + value.getValue().toString());
        }

        Predicate<Product> localDatePredicate = p -> {return LocalDate.now().isBefore(p.getBestBeforeDate());};
        Map<Boolean, List<Product>> outPutMap = productList.stream().collect(Collectors.partitioningBy(localDatePredicate));
        for(Map.Entry<Boolean,List<Product>> value : outPutMap.entrySet()){
            System.out.println("Boolean key is = " + value.getKey() + " Boolean Value is " + value.getValue().toString());
        }
    }

}
