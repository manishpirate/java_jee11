package demo.Interfaces;

import java.math.BigDecimal;

interface TestMe<T> {
    String getValue(T t);
}

abstract class Test<T> implements TestMe<String> {


}

class Test2 extends Test<BigDecimal> {

    @Override
    public String getValue(String s) {
        return "yo";
    }
}

public class TestOf {

    public static void main(String[] args) {
        Test intTest = new Test2();
        System.out.println(intTest.getValue(new String("")));
    }
}
