package com.jinhogate.lambdaexpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpression {

    public static void main(String[] args) {
        System.out.println("#Consumer");
        Consumer<Integer> consumer = System.out::println;
        List<Integer> integers = List.of(1, 2, 3);
        integers.forEach(consumer);
        consumer.accept(10);
        System.out.println("#predicate");
//        Predicate<String> p = s-> s.length()<2;
//        System.out.println(p.test("p"));

    }

}
