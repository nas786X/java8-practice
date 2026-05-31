package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.of(2018, 7, 21, 23, 59, 59);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime3);

        // get the time and date from localdatetime instance

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));

        // modifying localDateTime

        System.out.println(localDateTime.plusHours(2));
        System.out.println(localDateTime.minusDays(2));

        // modify date using with method
        System.out.println(localDateTime.withMonth(6));

        // converting localDate, localTime to localDateTime and viceversa
        LocalDate localDate = LocalDate.of(2019, 01, 01);
        System.out.println(localDate.atTime(23,23)); //get localDateTime from localDate

        LocalTime localTime = LocalTime.of(23, 59, 59);
        System.out.println(localTime.atDate(LocalDate.now())); //get localDateTime form localTime

        LocalDateTime localDateTime4 = localTime.atDate(LocalDate.now());
        System.out.println(localDateTime4.toLocalDate());//get date from localDateTime
        System.out.println(localDateTime4.toLocalTime());//get time from localDateTime

    }
}
