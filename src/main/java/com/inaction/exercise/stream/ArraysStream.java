package com.inaction.exercise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class ArraysStream {

    public static void main(String[] args) {
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        streamOfWords.forEach(System.out::println);





    }
}
