package com.inaction.exercise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class NotReuse {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C");

        Stream<String> s = strings.stream();
        s.forEach(System.out::println);

        /** {@link java.lang.IllegalStateException}: stream has already been operated upon or closed
         * 이미 사용한 stream 은 다시 사용할 수 없다.
         */
        s.forEach(System.out::println);

    }
}
