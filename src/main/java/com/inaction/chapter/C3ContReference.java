package com.inaction.chapter;

import com.inaction.ex.Apple;
import com.inaction.ex.Fruit;
import com.inaction.ex.Orange;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by hclee on 2016-06-10.
 *
 * @author hclee
 */
public class C3ContReference {

    public static void main(String[] args) {

        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);

        System.out.println("apples size is: " + apples.size());

        apples.sort((a1, a2) -> Integer.valueOf(a1.getWeight()).compareTo(a2.getWeight()));
        apples.forEach((a) -> System.out.println(a.getWeight()));

        // ---------------------

        System.out.println(givemeFruit("apple", 1000).getWeight());
    }

    private static Fruit givemeFruit(String fruit, Integer weight) {

        Map<String, Function<Integer, Fruit>> map = new HashMap<>();
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);

        return map.get(fruit.toLowerCase()).apply(weight);
    }

    private static List<Apple> map(List<Integer> weights,
                                   Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Integer e : weights) {
            result.add(f.apply(e));
        }
        return result;
    }


    private static void exDefaultConstructor() {
        // -- 기본 생성자 --
        Supplier<Apple> c0 = () -> new Apple();
        Apple a0 = c0.get();

        // Default Constructor
        Supplier<Apple> c01 = Apple::new;
        Apple a1 = c01.get();


        // -- 인자를 받는 생성자 --
        Function<Integer, Apple> cp1 = (weight) -> new Apple(weight);
        Apple ap1 = cp1.apply(100);

        // Default Constructor
        Function<Integer, Apple> cp11 = Apple::new;
        Apple ap11 = cp11.apply(250);


        // -- 인자를 2개 받는 생성자 --
        /**
         * {@link BiFunction} ??
         * Represents a function that accepts two arguments and produces a result.
         * This is the two-arity specialization of {@link Function}.
         */
        BiFunction<String, Integer, Apple> cp2 = (color, weight) -> new Apple(color, weight);
        Apple ap2 = cp2.apply("green", 123);

        // Default Constructor
        BiFunction<String, Integer, Apple> cp21 = Apple::new;
        Apple ap21 = cp21.apply("green", 123);


    }

}
