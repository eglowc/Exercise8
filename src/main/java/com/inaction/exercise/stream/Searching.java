package com.inaction.exercise.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class Searching {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        list.stream()
                .filter(i -> i > 30)
                .findAny()
                .ifPresent(System.out::println);
    }

}
