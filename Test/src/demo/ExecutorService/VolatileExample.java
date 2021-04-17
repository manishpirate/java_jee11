package demo.ExecutorService;

public class VolatileExample {

    public static void main(String[] args) {
        Shared s = new Shared();
        new Thread(()->{
            while(s.y<1){
                int x = s.x+2;
                System.out.println(x);
            }
        }).start();
        new Thread(()-> {
            s.x = 3;
            s.y = 2;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We Have updated the x and y value");
        }).start();
    }
}
