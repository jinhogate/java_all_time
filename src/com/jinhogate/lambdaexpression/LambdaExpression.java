package com.jinhogate.lambdaexpression;

import java.util.List;
import java.util.Objects;
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
        System.out.println("Predicate : Vérifie qu'un string a une longueur > 5");
        Predicate<String> predicate = s -> s.length() > 5;
        boolean predicateRes = predicate.test("Amadou");
        System.out.println("Resultat predicate : " + predicateRes);
        /***
         * Utilisation plus poussée des lambda expression
         */
        System.out.println("#Utilisation avancée des lambda");
        com.jinhogate.lambdaexpression.Consumer<String> c1 = s -> System.out.println("C1 = " + s);
        com.jinhogate.lambdaexpression.Consumer<String> c2 = s -> System.out.println("C2 = " + s);

//        com.jinhogate.lambdaexpression.Consumer<String> c3 = s -> {
//            c1.accept(s);
//            c2.accept(s);
//        };

        com.jinhogate.lambdaexpression.Consumer<String> c3 = c1.andThen(c2);
        c3.accept("bonjour");
        System.out.println("#Mise en pratique avec les predicats");
        com.jinhogate.lambdaexpression.Predicate<String> p1 = s -> s!=null;
        com.jinhogate.lambdaexpression.Predicate<String> p2 = s -> !s.isEmpty();

        com.jinhogate.lambdaexpression.Predicate<String> p3 = p1.and(p2);
        System.out.println("p3 : " + p3.test("ana"));

    }

}
