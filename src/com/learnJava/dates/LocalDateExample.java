package com.learnJava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 7, 17);
        System.out.println("LocalDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 7);
        System.out.println("LocalDate2: " + localDate2);

        //Get values from localDate
//        System.out.println(localDate.getMonth());//MAY
//        System.out.println(localDate.getMonthValue());//5
//
//        System.out.println(localDate.getDayOfWeek());//MONDAY
//        System.out.println(localDate.getDayOfMonth());//25
//        System.out.println(localDate.getDayOfYear());//145
//
//        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));//same as getDayOfMonth 25
//
//
//        //Modifying local date
//        System.out.println(localDate.plusDays(2));
//        System.out.println(localDate.minusDays(2));
//        System.out.println(localDate.plusMonths(1));
//        System.out.println(localDate.withYear(2018));
//        System.out.println(localDate.with(ChronoField.YEAR, 2018));
//        System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));
//
//        System.out.println(localDate.minus(1, ChronoUnit.YEARS));

          //Additional Support Methods
//        System.out.println(localDate.isLeapYear());
//        System.out.println(LocalDate.ofYearDay(2020, 1).isLeapYear());
//
//        System.out.println(localDate.isEqual(localDate1));
//        System.out.println(localDate.isBefore(localDate2));
//        System.out.println(localDate.isAfter(localDate1));

          //Unsupported methods
//        System.out.println(localDate.isSupported(ChronoUnit.MINUTES));
//        System.out.println(localDate.minus(1, ChronoUnit.MINUTES));


    }
}
