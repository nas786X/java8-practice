package com.learnJava.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);

        LocalTime localTime1 = LocalTime.of(23, 33);
        System.out.println("localTime1: " + localTime1);

        LocalTime localTime2 = LocalTime.of(23, 33, 33);
        System.out.println("localTime2: " + localTime2);

        LocalTime localTime3 = LocalTime.of(23, 33, 33, 901910091);
        System.out.println("localTime2: " + localTime3);

        //getting the values

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());//represent time in seconds

        //modify time
        System.out.println(localTime.minusHours(2).minusMinutes(30));
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));
        System.out.println(localTime.with(LocalTime.MIDNIGHT));
        System.out.println(localTime.with(ChronoField.HOUR_OF_DAY, 20));
        System.out.println(localTime.plusMinutes(2));
        System.out.println(localTime.withHour(20));



    }
}
