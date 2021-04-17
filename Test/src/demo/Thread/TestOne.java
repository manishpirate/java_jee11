package demo.Thread;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TestOne {

    public static void main(String[] args) {
        Test t1 = new Test();
        new Thread(() -> {
            System.out.println("t1 = " + t1.formatDate(new Date()));
        }).start();
        new Thread(() -> {
            System.out.println("t1 = " + t1.formatDate(new Date()));
        }).start();

    }

}

class Test {
    private static final ThreadLocal<SimpleDateFormat> sdf =
            new ThreadLocal<SimpleDateFormat>() {
                @Override
                protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyy MMM dd HH mm ss");
                }
            };


    public String formatDate(Date date){
        return sdf.get().format(date);
    }
}
