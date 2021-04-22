package demo.Lambda;

import java.nio.file.Path;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;

public class TestOne {

    public static void main(String[] args) {
        DoubleFunction<Double> area = r -> Math.PI * r*r;
        Path path = Path.of("/","Users","joe","docs","some.txt");
        Path fileName = path.getFileName();
        System.out.println("fileName = " + fileName);
        Path somePath =  path.getParent();
        System.out.println("somePath = " + somePath);
        System.out.println(somePath.relativize(fileName));
    }
}
