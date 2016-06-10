package com.inaction.quizz;

/**
 * Created by HCLEE on 2016. 6. 9..
 *
 * @author eglowc
 */
public class q3_1 {

    // psvm
    public static void main(String[] args) {
        // lambda
        // {} 을 사용하는 경우 반드시 return 구문을 사용해야 한다.

//        print(() -> {});
        print(() -> "Hello");
        print(() -> {
            String word = "World !";
            return "Hello" + word;
        });
        print(() -> 3);

        System.out.println("---");

        // 행동을 파라미터로 주는거.. 앞에 온 친구를 다시 뒤로 던져 받아서.
        // 앞에 있는걸 파라미터로 받아서 뒤에서 그거 가지고 뭔가 하는거다.
        print2(2, e -> e + 2);
        print2(3, (e) -> e + 2);
        print2(4, (Integer e) -> e * 2);
        print2(4, (e) -> {
                    int i = 2;
                    return e / i;
                }
        );

    }

    public static void print(printValue lambda) {
        System.out.println(lambda.value());
    }

    public static void print2(int i, printValue2<Integer> lambda) {
        System.out.println(lambda.value(i));
    }


    interface printValue<T> {
        T value();
    }

    interface printValue2<T> {
        T value(T t);
    }
}
