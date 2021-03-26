package com.manish.learning.learningspring.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyy-MM-dd");

    public static Date createDateFromDateString(String dateString){
        Date date = null;
        if(null!=dateString){
            try {
                date = DATE_FORMAT.parse(dateString);
            }catch(ParseException ex){
                date = new Date();
            }
        }else{
            date = new Date();
        }
        return date;
    }
}
