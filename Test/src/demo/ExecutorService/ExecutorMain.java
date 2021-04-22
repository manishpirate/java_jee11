package demo.ExecutorService;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {



    public static void main(String[] args) {
        //service with 3 thread in pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //creating 10 tasks to be assigned to the pool
        for(int i=1; i<=10; i++){
            executorService.execute(
                    () -> {
                        //This is lambda for runnable interface code for run method
                        System.out.println("------------------------------");
                        System.out.println("This code is getting executed.");
                        Thread t1 = Thread.currentThread();
                        System.out.println("Thread id and name is " +  t1.getId() + " Name " + t1.getName());
                        System.out.println("This code is completely executed.");
                        System.out.println("------------------------------");

                    }
            );
        }
        executorService.shutdown();//stop accepting any new thread
       /* //we will wait for threads to complete
        try {
            if(!executorService.awaitTermination(30L, TimeUnit.SECONDS)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }*/

    }


}
