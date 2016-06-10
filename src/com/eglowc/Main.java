package com.eglowc;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Lambda Expression
        Function<String, Integer> toInt = (value) -> Integer.parseInt(value) ;
        final Integer number1 = toInt.apply("100");
        System.out.println(number1);

        // Method Reference
        Function<String, Integer> toIntMR = Integer::parseInt ;
        final Integer number2 = toIntMR.apply("100");
        System.out.println(number1);

    }

}
