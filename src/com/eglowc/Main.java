package com.eglowc;

import java.util.function.Function;

public class Main {



    public static void main(String[] args) {

        Function<String, Integer> toInt = (value) -> Integer.parseInt(value) ;

        final Integer number = toInt.apply("100");
        System.out.println(number);






    }


}
