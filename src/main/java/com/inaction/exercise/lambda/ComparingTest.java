package com.inaction.exercise.lambda;

import com.inaction.ex.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by HCLEE on 2016. 6. 10..
 *
 * @author eglowc
 */
public class ComparingTest {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple("green", 100, "apple"),
                new Apple("yellow", 300, "apple"),
                new Apple("red", 200, "apple")
        );

        printSortedApples(apples);
        System.out.println();

//        printReverseSortedApples(apples, Comparator.comparing((a) -> a.getWeight()));
        // Method Reference
        printReverseSortedApples(apples, Comparator.comparing(Apple::getWeight));


    }

    // 출력
    private static void printApples(List<Apple> apples) {
        apples.forEach(a -> System.out.println(a.getName() + ":" +
                a.getWeight() + ":" +
                a.getColor())
        );
    }

    // 정렬
    private static void printSortedApples(List<Apple> apples) {
//        Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getWeight());
        // Method Reference
        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
        apples.sort(c);
        printApples(apples);
    }

    // 역정렬
    private static void printReverseSortedApples(List<Apple> apples, Comparator<Apple> comparing) {
        apples.sort(comparing.reversed());
        printApples(apples);
    }
}
