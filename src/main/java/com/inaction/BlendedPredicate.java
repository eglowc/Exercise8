package com.inaction;

import com.inaction.ex.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by HCLEE on 2016. 6. 10..
 * <p>
 * {@link Predicate} 를 조합해서 사용하기
 *
 * @author eglowc
 */
public class BlendedPredicate {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple("green", 100, "apple1"),
                new Apple("red", 50, "apple2"),
                new Apple("red", 300, "apple4"),
                new Apple("blue", 190, "apple3"),
                new Apple("red", 200, "apple5")
        );


        System.out.println("\n==red Apple==");
        Predicate<Apple> redApple = a -> a.getColor().equals("red");
        printApples(getFilterApple(apples, redApple));

        System.out.println("\n==not red Apple==");
        Predicate<Apple> notRedApple = redApple.negate();
        printApples(getFilterApple(apples, notRedApple));

        System.out.println("\n==weight > 150 Apple==");
        Predicate<Apple> greaterThan150Apple = a -> a.getWeight() > 150;
        printApples(
                getFilterApple(
                        apples,
                        greaterThan150Apple)
        );

        System.out.println("\n==weight > 150 Apple And red Apple==");
        printApples(
                getFilterApple(
                        apples,
                        greaterThan150Apple
                                .and(redApple)
                )
        );

        System.out.println("\n==weight > 150 Apple And red Apple Or green Apple==");
        /* ( 150이상 && red) || green */
        printApples(
                getFilterApple(
                        apples,
                        greaterThan150Apple
                                .and(redApple)
                                .or(a -> a.getColor().equals("green"))
                )
        );

    }

    // 출력
    private static void printApples(List<Apple> apples) {
        for (Apple apple : apples) {
            System.out.println(apple.toString());
        }
    }

    // Predicate 를 이용한 filter
    private static <T> List<T> getFilterApple(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }


}
