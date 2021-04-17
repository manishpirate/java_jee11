package demo.Locking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestClass {
    private List<String> arrayList = new ArrayList<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock r1 = lock.readLock();
    private Lock r2 = lock.writeLock();

    public void ReadList() {
        //taking read lock before reading
        r1.lock();
        System.out.println("Reading list");
        arrayList.stream().forEach(System.out::println);
        r1.unlock();
    }

    public void addValue(String value) throws InterruptedException {
        r2.lock();
        arrayList.add(value);
        Thread.sleep(1000);
        r2.unlock();
        System.out.println("writing of data is complete");
    }


}
