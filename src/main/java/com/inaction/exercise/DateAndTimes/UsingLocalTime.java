package com.inaction.exercise.DateAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by HCLEE on 2016. 6. 16..
 *
 * @author eglowc
 */
public class UsingLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(13, 45, 20);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println("  time: " + time);
        System.out.println("  hour: " + hour);
        System.out.println("minute: " + minute);
        System.out.println("second: " + second);

        System.out.println();
        System.out.println("===parse String to===");

        String sDate = "2016-11-11";
        String sTime = "09:13:14";
        LocalDate toDate = LocalDate.parse(sDate);
        LocalTime toTime = LocalTime.parse(sTime);

        System.out.println(toDate);
        System.out.println(toTime);

    }
}
