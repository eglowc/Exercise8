package com.inaction.exercise.stream;

import java.util.stream.Stream;

/**
 * Created by HCLEE on 2016. 6. 14..
 *
 * @author eglowc
 */
public class StreamIterator {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 3)
                .limit(3)
                .forEach(System.out::println);
    }
}
