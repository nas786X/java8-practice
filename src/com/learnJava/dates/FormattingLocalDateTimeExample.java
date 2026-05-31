package com.learnJava.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    public static void parseLocalDateTime() {
        //string to localDateTime
        String dateTime = "2018-04-18T14:33:33";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, dateTimeFormatter);
        System.out.println(localDateTime1);

        String dateTime1 = "2018-04-18T14|33|33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, dateTimeFormatter1);
        System.out.println(localDateTime2);

        String dateTime2 = "2018-04-18abc14:33:33";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime1, dateTimeFormatter1);
        System.out.println(localDateTime3);

    }

    public static void formatLocalDateTime() {
        //localDateTime to string
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String  formattedDateTime = localDateTime.format(dateTimeFormatter2);
        System.out.println(formattedDateTime);
    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
