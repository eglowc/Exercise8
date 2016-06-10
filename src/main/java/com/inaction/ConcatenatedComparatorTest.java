package com.inaction;

import com.inaction.ex.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by HCLEE on 2016. 6. 10..
 *
 * Comparator 를 연결해서 사용할 수 있다.
 *
 * @author eglowc
 */
public class ConcatenatedComparatorTest {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple("green", 100, "apple1"),
                new Apple("yellow", 300, "apple2"),
                new Apple("blue", 300, "apple4"),
                new Apple("blue", 300, "apple3"),
                new Apple("red", 200, "apple5")
        );

        /* 같은 weight 300 은 누가 먼저 나오게 되나? */
        apples.sort(Comparator.comparing(Apple::getWeight));
        printApples(apples);

        System.out.println();

        /* thenComparing() 을 이용한 Comparator 연결. 같은 값이면 color 를 비교 */
        apples.sort(Comparator.comparing(Apple::getWeight)
                .thenComparing(Apple::getColor));
        printApples(apples);

        System.out.println();

        /* weight 와 color 까지 같으면 ? name 까지 비교하도록 더 연결할 수도 있다 */
        apples.sort(Comparator.comparing(Apple::getWeight)
                .thenComparing(Apple::getColor)
                .thenComparing(Apple::getName));
        printApples(apples);

    }

    private static void printApples(List<Apple> apples) {
        for (Apple apple : apples) {
            System.out.println(apple.toString());
        }
    }
}
