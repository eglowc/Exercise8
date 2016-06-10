package com.inaction.quizz;

import java.util.concurrent.Callable;

/**
 * Created by HCLEE on 2016. 6. 9..
 *
 * @author eglowc
 */
public class q3_3 {
    public static void main(String[] args) {
        execute(() -> {});

    }

    public static void execute(Runnable r) {
        r.run();
    }

    public static Callable<String> fetch() {
        return () -> "Hello";
    }
}
