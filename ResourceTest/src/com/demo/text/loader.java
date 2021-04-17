package com.demo.text;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class loader {

    public static void main(String args[]){
        Locale englishLocale = Locale.ENGLISH;
        ResourceBundle bundle = ResourceBundle.getBundle("resources.messages", englishLocale);
        String orderMessage = bundle.getString("order");
        System.out.println(MessageFormat.format(orderMessage, "1",23, 2, "2020-01"));
    }
}
