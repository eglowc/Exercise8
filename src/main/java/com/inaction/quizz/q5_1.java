package com.inaction.quizz;

import com.inaction.exercise.stream.temp.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class q5_1 {

    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        /* 처음 등장하는 두 고기 요리 필터링 */
        List<Dish> dishes = menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());

        // 확인
        dishes.forEach(System.out::println);

    }

}
