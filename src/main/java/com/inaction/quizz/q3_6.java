package com.inaction.quizz;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * Created by hclee on 2016-06-10.
 *
 * @author hclee
 */
public class q3_6 {

    public static void main(String[] args) {
        // Replace Lambda with Method Reference

        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToIntegerMethodRef = Integer::parseInt;

        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
        BiPredicate<List<String>, String> containsMethodRef = List::contains;
    }
}
