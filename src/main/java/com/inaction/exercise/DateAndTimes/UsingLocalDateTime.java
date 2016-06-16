package com.inaction.exercise.DateAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by HCLEE on 2016. 6. 16..
 *
 * @author eglowc
 */
public class UsingLocalDateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(13, 45, 20);
        LocalDate date = LocalDate.of(2016, 6, 16);

        LocalDateTime dt1 = LocalDateTime.of(2016, Month.AUGUST, 30, 13, 22, 23);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(11, 12, 13);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        System.out.println("dt1: " + dt1);
        System.out.println("dt2: " + dt2);
        System.out.println("dt3: " + dt3);
        System.out.println("dt4: " + dt4);
        System.out.println("dt5: " + dt5);


        LocalDate date1 = dt1.toLocalDate();
        LocalTime time1 = dt1.toLocalTime();

        System.out.println("date1: " + date1);
        System.out.println("time1: " + time1);
    }
}
