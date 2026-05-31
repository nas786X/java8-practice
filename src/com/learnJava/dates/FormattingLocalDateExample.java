package com.learnJava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate(){
        //string to localDate
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate " +localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);

        String date1 = "20180428";
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate1 " +localDate1);

        String date2 = "2018-28-04";
        LocalDate localDate3 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-dd-MM"));
        System.out.println("localDate3 " +localDate3);

        String date3 = "2018|04|28";
        LocalDate localDate4 = LocalDate.parse(date3, DateTimeFormatter.ofPattern("yyyy|MM|dd"));
        System.out.println("localDate4 " +localDate4);

    }

    public static void formatLocalDate(){
        //localDate to String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String date = localDate.format(formatter);
        System.out.println("formattedlocalDate " +date);

    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
