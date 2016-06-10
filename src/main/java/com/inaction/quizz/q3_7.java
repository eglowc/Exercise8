package com.inaction.quizz;

import com.inaction.ex.Apple;

/**
 * Created by hclee on 2016-06-10.
 *
 * @author hclee
 */
public class q3_7 {

    // 3개이상 인자를 받는 생성자 레퍼런스의 경우에는 ? 직접 만들어야 함...

    public static void main(String[] args) {

        TriFunction<String, Integer, String, Apple> tf = Apple::new;
        Apple a1 = tf.apply("red", 250, "apple");
        System.out.println("this fruit name is: " + a1.getName() +
                        " weight is: " + a1.getWeight() +
                        " name is: " + a1.getName()
        );
    }

    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
