package com.inaction.exercise.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by HCLEE on 2016. 6. 14..
 *
 * @author eglowc
 */
public class BuildingStream {
    public static void main(String[] args) {
        System.out.println("==String Stream==");

        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action ");
        stream.map(String::toUpperCase)
                .forEach(System.out::println);

//        Stream<String> emptyStream = Stream.empty();


        System.out.println("\n==IntStream==");

        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("IntStream sum: " + sum);


        System.out.println("\n==FileStream==");

        long uniqueWords = 0;
        try (Stream<String> lines =
                     Files.lines(Paths.get("lambdasinaction/chap5/data.txt"), Charset.defaultCharset())) {
            uniqueWords =
                    lines.flatMap(line -> Arrays.stream(line.split(" ")))
                            .distinct()
                            .count();
        } catch (IOException e) {
            // IOException
        }


    }
}
