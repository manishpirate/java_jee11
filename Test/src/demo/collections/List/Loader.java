package demo.collections.List;

import java.util.*;

public class Loader {
    public static void main(String[] args) {
       List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        List<String> otherList = List.of("One", "Two");
        for(String val : otherList){
            System.out.println(val);
        }
        //otherList.add("23");
        otherList = Collections.unmodifiableList(list);
        //otherList.add("345");
        otherList.set(1, "345");

        otherList = Arrays.asList("two","three");
        otherList.set(1,"five");
        for(String val : otherList){
            System.out.println(val);
        }

        List<String> testString = new ArrayList<>();
        testString.add("One");
        testString.add("Two");
        testString.add(2,null);
        testString.add(3,"three");
        Loader l1=new Loader();
        //l1.printStringList(testString);
        //adding one more element at 2 position now
        testString.add(2,"Five");
        //l1.printStringList(testString);
        testString.replaceAll(x -> x + "hey ");
        l1.printStringList(testString);
    }

    public void printStringList(List<String> testString){
        for(String val : testString){
            System.out.println(testString.indexOf(val) + " ------> " + val);
        }
    }

}
