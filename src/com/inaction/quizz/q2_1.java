package com.inaction.quizz;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HCLEE on 2016. 6. 9..
 *
 * @author eglowc
 */
public class q2_1 {


    public static void main(String[] main) {

        List<Apple> apples = Arrays.asList(
                new Apple("green", 150),
                new Apple("green", 100),
                new Apple("red", 200),
                new Apple("red", 50)
        );
        prettyPrintApple(apples, new printAppleWeight());
        prettyPrintApple(apples, new printIsHeavyApple());
    }

    private static void prettyPrintApple(List<Apple> inventory, PrintApple printApple) {
        for (Apple a : inventory) {
            String output = (String) printApple.print(a);
            System.out.println(output);
        }
    }

    private static class Apple {
        private String color;
        private int weight;

        public Apple(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }
    }

    private interface PrintApple<T> {
        T print(Apple apple);
    }

    private static class printAppleWeight implements PrintApple {

        @Override
        public String print(Apple apple) {
            return String.valueOf(apple.weight);
        }
    }

    private static class printIsHeavyApple implements PrintApple {

        @Override
        public String print(Apple apple) {
            return apple.weight + "\t : " + (apple.weight >= 150 ? "heavy" : "light");

        }
    }
}
