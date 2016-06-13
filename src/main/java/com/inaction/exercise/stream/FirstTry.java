package com.inaction.exercise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by HCLEE on 2016. 6. 12..
 *
 * @author eglowc
 */
public class FirstTry {

    public static void main(String[] args) {
        List<Menu> menuList = Arrays.asList(
                new Menu("noodle", 200),
                new Menu("apple", 50),
                new Menu("coffee", 30),
                new Menu("bread", 100)
        );

        menuList.forEach(System.out::println);

        List<String> menuNames =
        menuList.stream()
                .filter(i -> i.getCalories() > 55)
                .sorted(comparing(Menu::getCalories))
                .map(Menu::getName)
                .collect(toList());

        System.out.println();
        menuNames.forEach(System.out::println);
    }

    private static class Menu {
        private String name;
        private int calories;

        public Menu() {
            super();
        }

        public Menu(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public int getCalories() {
            return calories;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Menu{");
            sb.append("name='").append(name).append('\'');
            sb.append(", calories=").append(calories);
            sb.append('}');
            return sb.toString();
        }
    }


}
