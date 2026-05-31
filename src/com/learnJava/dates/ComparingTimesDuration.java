package com.learnJava.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDuration {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(9,15);
        long min = ChronoUnit.MINUTES.between(localTime, localTime1);
        System.out.println(min);
        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(2);
        System.out.println(duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(90);
        System.out.println(duration2.toHours());


    }
}
