package com.inaction.exercise.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by HCLEE on 2016. 6. 9..
 *
 *  lambda 를 이용하면 기존의 익명 클래스를 생성하던 복잡한 코드를 단순화 할 수 있는 것.
 *
 * @author eglowc
 */
public class ComparatorTest {

    public static void main(String[] args) {
        List<Apple> inventory = getApples();
        List<Apple> inventory2 = getApples();

        printLoopInventory(inventory);

        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return Integer.valueOf(a1.getWeight()).compareTo(a2.getWeight());
//                return (a1.getWeight() < a2.getWeight()) ? -1:(a1.getWeight() > a2.getWeight()) ? 1:0 ;
            }
        });

        printLoopInventory(inventory);


        // -- lambda 표현식으로 정렬 --

        printLoopInventory(inventory2);

        inventory2.sort((Apple a1, Apple a2) -> Integer.valueOf(a1.getWeight()).compareTo(a2.getWeight()));

        printLoopInventory(inventory2);
    }

    private static void printLoopInventory(List<Apple> inventory) {
        for (Apple a : inventory) {
            System.out.println(a.getWeight());
        }
        System.out.println();
    }


    private static List<Apple> getApples() {
        return Arrays.asList(
                new Apple("green", 150),
                new Apple("green", 100),
                new Apple("red", 200),
                new Apple("red", 50)
        );
    }

    private static class Apple {
        private String color;
        private int weight;

        public Apple(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }
    }
}
