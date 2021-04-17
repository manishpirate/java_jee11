package demo.Stream.Base;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
        //First we will create a list of Products
        List<Product> productList = new ArrayList<>();
        Product p1 = null;
        LocalDate date = LocalDate.now();
        for (int i = 0; i<10; i++){
            p1 = new Product("Maggi" + i, 23 + 2*i, date.plusDays(i+5));
            productList.add(p1);
        }
        //we need to get the list of products where price is greater than 34
        Predicate<Product> discountPredicate = (p)->{ return p.getProductPrice() > 34; };
        //filtering and printing the list
        productList.stream().filter(discountPredicate).forEach(System.out::println);
        //we will not see the use of function interface
        //In this example we are trying to convert the Product Object to Date
        Function<Product, LocalDate> convertToDateFunction = (p) -> { return p.getBestBefore(); };
        //we will process the productList to get all the best before date
        //we will add a new filter to filter the local date time
        Predicate<LocalDate> validateLocalDate = (p) -> {return p.isBefore(LocalDate.now().plusDays(15));};

        UnaryOperator<String> localDateUnaryOperator = (s) -> {return s + " hello";};
        //we will apply this unary function to the date on product list
        //productList.stream().map(convertToDateFunction).forEach(l->localDateUnaryOperator.apply(l));
        System.out.println("----- Date Values after change -----");
        productList.stream().map(convertToDateFunction).forEach(System.out::println);
        List<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");
        strList.add("Three");
        strList.add("Four");
        strList.add("Five");
       


    }

}
