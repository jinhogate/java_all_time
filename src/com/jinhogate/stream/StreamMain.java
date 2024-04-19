package com.jinhogate.stream;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        User kossi = new User("kossi", 25);
        User armand = new User("armand", 18);
        User alaglo = new User("alaglo", 28);
        User credo = new User("credo", 20);
        User eric = new User("eric", 29);
        ArrayList<User> users = new ArrayList<>();
        users.add(kossi);
        users.add(armand);
        users.add(alaglo);
        users.add(credo);
        users.add(eric);
        /***
         * calcul moyenne d'age de plus de 20ans
         */
        int compteur = 0;
        int sommeAge = 0;
        for (User u : users) {
            if (u.getAge() > 20) {
                compteur++;
                sommeAge += u.getAge();
            }
        }
        System.out.println("Moyenne d'age = " + sommeAge / compteur);
        System.out.println("#Map/filter/reduce");
        Stream<Integer> ages = users.stream().map(User::getAge);
        Stream<Integer> ageFiltered = ages.filter(age -> age > 20);
        Optional<Integer> reduce = ageFiltered.reduce((val, accumul) -> {
            accumul += val;
            return accumul;
        });
        System.out.println(reduce.isPresent() ? reduce.get() : "");
        System.out.println("#Stream de nombres");
        IntStream ints = new Random().ints();
//        ints.filter(i->i<10 && i>0).distinct().limit(5).forEach(System.out::println);
        IntStream.range(0, 10).forEach(System.out::println);
        List<User> userList = IntStream.range(0, 5)
                .mapToObj(i -> new User("prenom" + i, 12 + i))
                .toList();
        System.out.println(userList);
        String s = "Bonjour le monde";
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));
        Stream<String> stream = Arrays.stream(split);
        Pattern compile = Pattern.compile(" ");
        Stream<String> stringStream = compile.splitAsStream(s);
        System.out.println("Code ascii");
        String alphabet = "abcdefghijklm";
        IntStream chars = alphabet.chars();
        System.out.println("Alphabet");
        Stream<String> stringStream1 = chars.mapToObj(Character::toString);
        stringStream1.forEach(System.out::println);
        System.out.println("To set action");
        Stream.of(1, 1, 23, 2, 24, 4, 1, 11).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("takewile");
        Stream.of(1, 2, 3, 45, 48).takeWhile(i -> i > 0).forEach(System.out::println);
        System.out.println("#dropwile");
        Stream.of("one", "two", "three", "four", "one")
                .dropWhile(str -> str.startsWith("o"))
                .forEach(System.out::println);
        System.out.println("#Appliquer un reduce sur un stream vide");
        Stream<Integer> numbers = Stream.of(1, 2);
        Optional<Integer> reduced = numbers.filter(i -> i > 2).reduce(Integer::sum);
        System.out.println(reduced.isPresent() ? reduced.get() : "none");
        System.out.println("#Utilisation average");
        System.out.println("#collectors");
        Stream<String> strings = Stream.of("one", "two", "three", "four", "five", "six", "seven");
//        List<String> collect = strings.toList();
//        Set<String> collect1 = strings.collect(Collectors.toSet());
        String collect2 = strings.collect(Collectors.joining(",", "(", ")"));
        System.out.println(collect2);
        System.out.println("#grouping by");
        Stream<String> groupings = Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight");
//        Map<Integer, List<String>> collect = groupings.collect(Collectors.groupingBy(String::length));
//        System.out.println(collect);
//        System.out.println("again grouping by");
//        Map<Integer, Long> collect1 = groupings.collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        Optional<Map.Entry<Integer, Long>> max = collect1.entrySet().stream().max(Comparator.comparingLong(e -> e.getValue()));
//        System.out.println(max.get());
        Map<Integer, Long> collect = groupings.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        Stream<Integer> integerStream = Stream.of(1, 2, 2, 1, 3, 2, 1, 1, 3, 3, 1, 4);
        Map<Integer, Long> collect1 = integerStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Integer, Long>> max = collect1.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max.isPresent() ? max.get() : "");
        Stream<Integer> intstream = Stream.of(1, 2, 3);
        IntStream nb = IntStream.of(1,2);
        OptionalDouble average = nb.average();
        average.ifPresent(System.out::println);
    }
}
