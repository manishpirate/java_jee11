package demo.test;


import java.nio.file.Paths;
import java.time.*;
import java.util.stream.Stream;

class C {
    String name = "C-Name";
}

class D extends C {
    String name = "D-name";
}

public class Test {

    public static void main(String args[]) throws Exception {
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDate date1 = LocalDate.of(2020, Month.DECEMBER, 31);
        System.out.println(date1);
        LocalTime time1 = LocalTime.of(13, 34);
        System.out.println(time1);
        LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.FEBRUARY, 12, 7, 12, 23);
        System.out.println(dateTime1);
        Instant instant = Instant.now();
        System.out.println(instant.getNano());
        Period period = Period.between(date, date1);
        System.out.println(period);
        Duration duration = Duration.ofHours(2);
        System.out.println(duration.minusMinutes(15).getSeconds());

    }

}
