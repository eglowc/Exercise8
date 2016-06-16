package com.inaction.exercise.DateAndTimes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * Created by HCLEE on 2016. 6. 16..
 *
 * @author eglowc
 */
public class UsingLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, 6, 16);
        System.out.println(date);

        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dw = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear(); // 윤년 계산!

        System.out.println(len);
        System.out.println(dw);

        LocalDate today = LocalDate.now();
        System.out.println("now(): " + today);

        System.out.println(today.get(ChronoField.YEAR));
    }
}
