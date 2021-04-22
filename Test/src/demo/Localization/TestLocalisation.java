package demo.Localization;

import javax.swing.text.NumberFormatter;
import java.nio.channels.FileChannel;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;

public class TestLocalisation {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        NumberFormat format =  NumberFormat.getCurrencyInstance();
        String result = format.format(234.56);
        System.out.println("result = " + result);
        Locale.setDefault(Locale.CHINA);
        format =  NumberFormat.getCurrencyInstance();
        result = format.format(234.56);
        System.out.println("result 2 = " + result);


    }

}
