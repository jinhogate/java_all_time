package com.jinhogate.apicollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetListClass {

    public static void main(String[] args) {
        System.out.println("#Vérification de l'unicité des éléments de set");
        HashSet<String> mots = new HashSet<>();
        mots.add("one");
        mots.add("two");
        mots.add("three");
        mots.add("one");
        System.out.println(mots);
        System.out.println("#Iterator sur un set");
        Iterator<String> iterator = mots.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /***
         * Création de sets immutables
         */
//        Set<Integer> chiffres = Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5); //IllegalArgumentException
        Set<Integer> chiffres = Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Affichage chiffres : " + chiffres);
//        chiffres.add(10); //UnsupportedOperationException
//        System.out.println("Affichage chiffres : " + chiffres);

    }
}
