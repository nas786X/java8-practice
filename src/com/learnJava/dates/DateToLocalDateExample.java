package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //date to LocalDate
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);

        Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);


        //sql date to LocalDate
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
        System.out.println(sqlDate);
        System.out.println(sqlDate.toLocalDate());
    }
}
