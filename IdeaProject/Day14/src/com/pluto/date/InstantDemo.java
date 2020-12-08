package com.pluto.date;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));

        System.out.println(offsetDateTime);
        long milli = instant.toEpochMilli();
        System.out.println(milli);


        System.out.println(Instant.ofEpochMilli(milli));

    }


}
