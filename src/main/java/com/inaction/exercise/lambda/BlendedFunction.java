package com.inaction.exercise.lambda;

import java.util.function.Function;

/**
 * Created by HCLEE on 2016. 6. 10..
 *
 * {@link Function} 조합해서 사용하기
 *
 * @author eglowc
 */
public class BlendedFunction {

    public static void main(String[] args) {

        final int i = 2;
        System.out.println("i: " + i);

        Function<Integer, Integer> f = x -> x + 1;
        System.out.println("\nx -> x + 1 , f.apply(i): " + f.apply(i));

        Function<Integer, Integer> g = x -> x * 2;
        System.out.println("\nx -> x * 2 , g.apply(i): " + g.apply(i));

        Function<Integer, Integer> h = f.andThen(g);
        System.out.println("\nf.andThen(g) , h.apply(i): " + h.apply(i));

        Function<Integer, Integer> composeH = f.compose(g);
        System.out.println("\nf.compose(g) , compseHh.apply(i): " + composeH.apply(i));



    }
}
