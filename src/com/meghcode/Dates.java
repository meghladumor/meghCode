package com.meghcode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {
        // Working with dates
        LocalDateTime now = LocalDateTime.now(); //  LocalDateTime is a static class so we can use it this way :)
      //  LocalDateTime current = new LocalDateTime();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getHour());
        System.out.println(now.minusDays(5));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // will just print the time :)

        // To create any specific date
        LocalDateTime someDate =  LocalDateTime.of(
                2000,
                Month.DECEMBER,
                1,
                14,
                55,
                22
        );
        System.out.println(someDate);
        LocalDate someDate2 =  LocalDate.of(
                2000,
                Month.DECEMBER,
                1
        );

        LocalTime someTime = LocalTime.of(
                12,55,55
        );






    }
}
