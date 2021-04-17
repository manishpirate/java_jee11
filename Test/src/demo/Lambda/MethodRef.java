package demo.Lambda;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodRef {

    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        s1.add("Hey");
        s1.add("Hello");
        s1.add("Oho");
        s1.add("Hello");
        TextFilter f1 = new TextFilter();
        Collections.sort(s1, f1::compareNames);
        for(String s : s1){
            System.out.println("s = " + s);
        }

        s1.removeIf(TextFilter::removeA);
        for(String s : s1){
            System.out.println("s = " + s);
        }
    }
}
