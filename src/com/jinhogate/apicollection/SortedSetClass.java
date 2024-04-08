package com.jinhogate.apicollection;

import com.jinhogate.objetstring.User;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetClass {
    public static void main(String[] args) {
        TreeSet<String> alphabets = new TreeSet<>();
        alphabets.add("b");
        alphabets.add("h");
        alphabets.add("d");
        alphabets.add("d");
        alphabets.add("a");
        System.out.println("Affiche : " + alphabets);

        /***
         * Créer un treeset de user avec comparator par ordre croissant sur le salary
         */
        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        users.add(new User(1000d, "kossi"));
        users.add(new User(800d, "didier"));
        users.add(new User(1500d, "pascale"));
        System.out.println("Affiche: " + users);
    }
}
