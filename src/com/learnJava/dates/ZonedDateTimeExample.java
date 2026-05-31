package com.learnJava.dates;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());

//        System.out.println(ZoneId.getAvailableZoneIds());

//        ZoneId.getAvailableZoneIds()
//                .forEach(System.out::println);
//        System.out.println(ZoneId.getAvailableZoneIds().size());
//        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
//        System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));
//        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
//        System.out.println(ZonedDateTime.now(ZoneId.of("America/Denver")));
//
//
//        System.out.println(LocalDateTime.now(ZoneId.of("America/Chicago")));
//        System.out.println(LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

        // convert from localDateTime, instant to ZonedLocalDate andtime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("America/Denver"));
        System.out.println(zonedDateTime1);
        ZonedDateTime zonedDateTime2 =  Instant.now().atZone(ZoneId.of("America/Detroit"));
        System.out.println(zonedDateTime2);
    }

}
