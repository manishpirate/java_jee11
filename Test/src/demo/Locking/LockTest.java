package demo.Locking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest {

    public static void main(String[] args) throws InterruptedException{
        TestClass t1 = new TestClass();
        new Thread( ()-> {
            try {
                t1.addValue("One");
                t1.addValue("Two");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        //second thread will be reading the value
        new Thread( ()->{
            t1.ReadList();
        }).start();
    }
}
