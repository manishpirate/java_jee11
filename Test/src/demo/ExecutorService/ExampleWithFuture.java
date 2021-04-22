package demo.ExecutorService;

import java.util.concurrent.*;

public class ExampleWithFuture {

    public static void main(String[] args) {

        Callable work = () -> {
            Thread t1 = Thread.currentThread();
            System.out.println("t1 details = " + t1.getName() + t1.getId());
            return "Hello";
        };

        ExecutorService ex = Executors.newFixedThreadPool(10);
        Future result = ex.submit(work);
        try {
            String output = (String) result.get(20, TimeUnit.SECONDS);
            System.out.println(output);
        }catch (Exception exc){
            System.out.println("error occurred" + exc.getMessage());
        }
        ex.shutdownNow();
    }
}