package com.inaction.exercise.DateAndTimes;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by HCLEE on 2016. 6. 17..
 *
 * @author eglowc
 */
public class ControlDate {
    public static void main(String[] args) {
        System.out.println("===with===");
        LocalDate ld1 = LocalDate.of(2016, 6, 16);
        LocalDate ld2 = ld1.withYear(2015);
        LocalDate ld3 = ld2.withDayOfMonth(27);
        LocalDate ld4 = ld3.with(ChronoField.DAY_OF_MONTH, 18);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);

        System.out.println();
        System.out.println("===calc===");
        LocalDate ldc1 = LocalDate.of(2016, 6, 18);
        LocalDate ldc2 = ldc1.plusWeeks(1);
        LocalDate ldc3 = ldc2.minusYears(3);
        LocalDate ldc4 = ldc3.plus(2, ChronoUnit.MONTHS);

        System.out.println(ldc1);
        System.out.println(ldc2);
        System.out.println(ldc3);
        System.out.println(ldc4);
    }
}
