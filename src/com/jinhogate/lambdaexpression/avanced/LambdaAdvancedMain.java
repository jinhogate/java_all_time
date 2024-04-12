package com.jinhogate.lambdaexpression.avanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaAdvancedMain {
    public static void main(String[] args) {
        User kylian = new User("kylian", 20);
        User ngolo = new User("ngolo", 28);
        User blaise = new User("blaise", 32);
        User frereBlaise = new User("blaise", 28);

        Function<User, String> getName = User::getName;// user -> user.getName();
        Function<User, Integer> getAge = User::getAge;

        Comparator<User> cmp = Comparator.comparing(getName).thenComparing(getAge);

        System.out.println("kylian<ngolo : " + (cmp.compare(kylian, ngolo) < 0));
        System.out.println("blaise<ngolo : " + (cmp.compare(blaise, ngolo) < 0));
        System.out.println("blaise<kylian : " + (cmp.compare(blaise, kylian) < 0));
        System.out.println("frereBlaise<blaise : " + (cmp.compare(frereBlaise, blaise) < 0));
        /***
         * Nomenclature des méthodes de référence
         */
        System.out.println("#Nomenclature des méthodes de référence");
//        BiFunction<String, String, Integer> rech = (s1, s2) -> s1.indexOf(s2);
        BiFunction<String, String, Integer> rech = String::indexOf;
        System.out.println(rech.apply("bonjour", "on"));
        ArrayList<String> strings = new ArrayList<>();
        strings.add("un");
        strings.add("deux");
        strings.add("trois");
        System.out.println("Affiche Strings : " + strings);
//        strings.replaceAll(s->s.toUpperCase());
        strings.replaceAll(String::toUpperCase);
        System.out.println("Affiche Strings : " + strings);
        /***
         * Expression lambda sur les maps
         */
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(75, "paris");
        maps.put(33, "bordeaux");
        maps.put(90, "belfort");
        System.out.println("Foreach");
        maps.forEach((cle, value) -> System.out.println(cle + " : " + value));
        System.out.println("Replaceall");
        maps.replaceAll((key, value) -> key+":"+value);
        System.out.println("Affichage du map : " + maps);
        System.out.println("Compute");
        maps.compute(91, (key, value)-> "belfort");
        System.out.println(maps);
        System.out.println("computeIfPresent");
        HashMap<Integer, List<String>> map = new HashMap<>();
        map.put(3, List.of("one", "two"));
        map.put(4, List.of("four", "five"));
        map.put(5, List.of("three", "seven"));
        map.computeIfAbsent(3, key-> List.of("height"));
        System.out.println("Affichage de map : " + map);

    }

}
