package demo.Thread;

public class ThreadClassTest {



    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            Thread th = Thread.currentThread();
            try {
                while (!th.isInterrupted()) {
                    System.out.println("Code is started");
                    Thread.sleep(1000);//sleeping for 1 milisecond
                    //we will run the loop till thread is interuppted
                }
            }catch(InterruptedException interuuptedException){
                System.out.println("Thread has been interuppted we will exit.");
                return;
            }
        };

        System.out.println("Program started");
        Thread t1 = new Thread(r);
        t1.start();//starting the thread
        //we will send an interrupt
        Thread.sleep(1000);
        t1.interrupt();
        System.out.println("Program ends");

    }

}
