package com.inaction.quizz;


import com.inaction.exercise.stream.temp.Dish;

import java.util.List;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class q5_3 {

    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu;

        /* map 과 reduce 를 이용해 요리개수 구하기 */
        long count0 = dishes.stream().count();
        System.out.println(count0);

        long count1 = dishes.stream()
                            .map(d -> 1)
                            .reduce(0, (a, b) -> a + b);
        System.out.println(count1);


    }
}
