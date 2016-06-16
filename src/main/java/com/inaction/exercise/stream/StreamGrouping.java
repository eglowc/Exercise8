package com.inaction.exercise.stream;

import com.inaction.exercise.stream.temp.Dish;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * Created by HCLEE on 2016. 6. 16..
 *
 * @author eglowc
 */
public class StreamGrouping {

    private static List<Dish> menu = Dish.menu;

    public static void main(String[] args) {
        Map<Dish.Type, List<Dish>> dishesByType =
                menu.stream()
                        .collect(groupingBy(Dish::getType));

        System.out.println(dishesByType);


        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel =
                menu.stream()
                        .collect(groupingBy(getDishCaloricLevelFunction()));

        System.out.println();
        System.out.println(dishesByCaloricLevel);

        System.out.println();
        System.out.println("===다수준 그룹화===");
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel =
                menu.stream()
                        .collect(groupingBy(Dish::getType,
                                groupingBy(getDishCaloricLevelFunction())
                        ));
        System.out.println(dishesByTypeCaloricLevel);

        System.out.println();
        System.out.println("===서브그룹===");
        Map<Dish.Type, Long> typesCount = menu.stream()
                .collect(groupingBy(Dish::getType, counting()));
        System.out.println(typesCount);

        System.out.println();
        Map<Dish.Type, Dish> mostCaloricByType =
                menu.stream()
                        .collect(groupingBy(Dish::getType,
                                collectingAndThen(
                                        maxBy(Comparator.comparingInt(Dish::getCalories)),
                                        Optional::get)));
        System.out.println(mostCaloricByType);

        System.out.println();
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType =
                menu.stream()
                        .collect(
                                groupingBy(Dish::getType, mapping(getDishCaloricLevelFunction(), toSet()))
                        );
    }

    private static Function<Dish, CaloricLevel> getDishCaloricLevelFunction() {
        return dish -> {
            if (dish.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }
        };
    }

    private enum CaloricLevel {DIET, NORMAL, FAT,}
}
