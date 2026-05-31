package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2018,01,01);
        LocalDate localDate2 = LocalDate.of(2018,12,31);

        Period period = localDate1.until(localDate2);
        System.out.println(period.getDays());//31-1 -> 30
        System.out.println(period.getMonths());//12-1 -> 11
        System.out.println(period.getYears());//2018-2018 -> 0

        Period period1 = Period.ofDays(10);
        System.out.println(period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println(period2.getYears());
        System.out.println(period2.toTotalMonths());

        Period period3 = Period.between(localDate1, localDate2);
        System.out.println(period3.getDays());
        System.out.println(period3.getMonths());
        System.out.println(period3.getYears());

        //days between
        LocalTime  localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(22,00,00);
        long min = ChronoUnit.MINUTES.between(localTime, localTime1);
        System.out.println(min);


    }

}
