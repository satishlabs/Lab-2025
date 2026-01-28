package com.alti.dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {
    static void main() {
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime ukTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India Time: "+indiaTime);
        System.out.println("US Time: "+ usTime);
        System.out.println("UK Time: "+ukTime);
    }
}
