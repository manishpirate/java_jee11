package demo.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

    public static  void  main(String args[]){
        ZoneId zoneIndia = ZoneId.of("GMT+5");
        ZoneId zoneLondon = ZoneId.of("Europe/London");
        ZoneId zoneLA = ZoneId.of("America/Los_Angeles");
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59);
        ZonedDateTime dateTimeZoned = ZonedDateTime.of(dateTime, zoneLondon);
        ZonedDateTime dateTimeZonedUS = dateTimeZoned.withZoneSameInstant(zoneLA);
        ZonedDateTime dateTimeIndia = dateTimeZoned.withZoneSameInstant(zoneIndia);
        System.out.println(dateTimeZonedUS);
        System.out.println(dateTimeZoned);
        System.out.println(dateTimeIndia);


    }
}
