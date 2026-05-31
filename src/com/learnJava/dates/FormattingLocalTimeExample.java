package com.learnJava.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingLocalTimeExample {

    public static void parseTime(){

        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(localTime1);

        //custom format
        String time1 = "11:00 PM";

        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofPattern("hh:mm a",  Locale.ENGLISH);

        LocalTime localTime2 = LocalTime.parse(time1, formatter1);

        System.out.println(localTime2);

    }

    public static void formatTime(){

        //time to string
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.ENGLISH);
        LocalTime localTime = LocalTime.now();
        String formattedTime = localTime.format(dateTimeFormatter);
        System.out.println(formattedTime);

    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
