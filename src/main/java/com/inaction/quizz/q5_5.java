package com.inaction.quizz;

import com.inaction.ex.Trader;
import com.inaction.ex.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by HCLEE on 2016. 6. 14..
 *
 * @author eglowc
 */
public class q5_5 {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        System.out.println("--1--");
        // q1 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("--2--");
        // q2 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
        List<String> cities =
                traders.stream()
                        .map(Trader::getCity)
                        .distinct()
                        .collect(Collectors.toList());
        cities.forEach(System.out::println);

        System.out.println("--3--");
        // q3 케임브리지(Cambridge)에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        traders.stream()
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("--4--");
        // q4 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오
//        traders.stream()
//                .sorted(Comparator.comparing(Trader::getName))
//                .forEach(System.out::println);

        /* q4 풀이 : 모든 거래자들을 알파벳순으로 반환하라는게 아니라 모든 거래자의 이름을 알파벳으로 정렬해서 각각 반환 하라는 것 */
        String traderStr = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);


        System.out.println("--5--");
        // q5 밀라노(Milan)에 거래자가 있는가?
        // q5-1
        System.out.println("exist traders in Milan?: " +
                traders.stream()
                        .anyMatch(t -> t.getCity().equals("Milan"))
        );

        // q5-2
        traders.stream()
                .filter(t -> t.getCity().equals("Milan"))
                .findAny()
                .ifPresent(t -> System.out.println("yes, exist traders in Milan"));

        // q5-3
        Optional<Trader> milan = traders.stream()
                .filter(t -> t.getCity().equals("Milan"))
                .findAny();
        System.out.println("exist traders in Milan?: " + milan.isPresent());

        System.out.println("--6--");
        // q6 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        List<Integer> cambridgeValues = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        cambridgeValues.forEach(System.out::println);

        System.out.println("--7--");
        // q7 전체 트랜잭션 중 최대값은 얼마인가?
        Optional<Integer> maxValue = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
        System.out.println("maxValue is: " + maxValue);

        System.out.println("--8--");
        // q7 전체 트랜잭션 중 최소값은 얼마인가?
        Optional<Integer> minValue = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
        System.out.println("minValue is: " + minValue);


    }
}
