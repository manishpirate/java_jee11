package demo.test;

import javax.swing.text.NumberFormatter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;

public class Format {

    /**
     *
     * @param args
     */
    public static void main(String args[]) throws ParseException {
        BigDecimal price = new BigDecimal(23.89);
        Double percentage = 0.2;
        int total = 23456;
        Locale us = new Locale("en", "GB");
        NumberFormat formatNumber = NumberFormat.getCurrencyInstance(us);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(us);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance();

        System.out.println(formatNumber.format(price));
        BigDecimal price2 = BigDecimal.valueOf((Double) formatNumber.parse("£23.89"));
        System.out.println(price2);
        System.out.println(numberFormat.format(total));
        System.out.println(percentageFormat.format(percentage));


        LocalDate dateTime = LocalDate.of(2020, Month.JULY, 21);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy", us);
        String result = dateTime.format(format);
        System.out.println(result);

        Locale russian = new Locale("ru");
        LocalDate date = LocalDate.parse(result, format);
        format = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(russian);
        System.out.println(date.format(format));


    }

}
