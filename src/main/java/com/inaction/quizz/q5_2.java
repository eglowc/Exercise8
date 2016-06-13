package com.inaction.quizz;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class q5_2 {

    public static void main(String[] args) {
        /* 숫자 리스트의 각 요소를 제곱하여 반환 */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqrtNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(toList());

        sqrtNumbers.forEach(System.out::println);

        List<Integer> i0 = Arrays.asList(1, 2, 3);
        List<Integer> i1 = Arrays.asList(3, 4);

        List<int[]> pairs =
                i0.stream()
                        .flatMap(i -> i1.stream()
                                .map(j -> new int[]{i, j})
                        )
                        .collect(toList());


    }
}
