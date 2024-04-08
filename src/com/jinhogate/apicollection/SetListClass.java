package com.jinhogate.apicollection;

import java.util.HashSet;
import java.util.Iterator;

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
    }
}
