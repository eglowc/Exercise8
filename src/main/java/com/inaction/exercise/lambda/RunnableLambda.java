package com.inaction.exercise.lambda;

/**
 * Created by HCLEE on 2016. 6. 9..
 *
 * @author eglowc
 */
public class RunnableLambda {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello Lambda !");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Anonymus Class !");
            }
        };

        run(r1);
        run(r2);
        run(() -> System.out.println("Hello Inline Lambda !"));
    }

    private static void run(Runnable r) {
        r.run();
    }
}
