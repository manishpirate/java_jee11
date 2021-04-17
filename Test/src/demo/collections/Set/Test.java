package demo.collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;

public class Test {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("One");
        s1.add("One");
        s1.add("Two");
        s1.add(null);
        s1.remove("Two");
        System.out.println(s1.contains("One"));
        for(String s : s1){
            System.out.println("s = " + s);
        }

    }

}
