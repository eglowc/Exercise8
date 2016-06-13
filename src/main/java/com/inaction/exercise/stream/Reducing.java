package com.inaction.exercise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class Reducing {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);



        BinaryOperator<Integer> plus = (a, b) -> a + b;
        BinaryOperator<Integer> plusR = Integer::sum;
        BinaryOperator<Integer> times = (a, b) -> a * b;

        int sum = list.stream().reduce(0, plus);
        System.out.println("  sum: " + sum);

        int multi = list.stream().reduce(1, times);
        System.out.println("multi: " + multi);
    }
}
