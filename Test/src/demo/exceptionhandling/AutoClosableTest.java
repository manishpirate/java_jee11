package demo.exceptionhandling;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

class Test implements AutoCloseable {



    public void display(){
        System.out.println("This is my sample code");
    }

    @Override
    public void close() throws IOException {
        System.out.println("I am a autoclosed code");
    }
}

class Test2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("I am a autoclosed-2 code");
    }
}

public class AutoClosableTest {

    public static void main(String[] args) throws Exception {
        Test t = new Test();
        try (t;
             Test2 t2 = new Test2()){
            t.display();
            throw new ArithmeticException();
        } catch(Exception ex){
            System.out.println("I am printed now in catch");
        }finally {
            System.out.println("I am called from finally");
        }
        List<String> L1 = new ArrayList<>(1);
        var q = new ArrayDeque<String>();



    }

}
