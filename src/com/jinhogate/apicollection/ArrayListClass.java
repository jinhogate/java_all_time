package com.jinhogate.apicollection;

import java.util.*;

public class ArrayListClass {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);

        list.remove("two");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println("#Itération sur un arraylist");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("#Foreach implémentation");
        for (String element : list) {
            System.out.println(element);
        }

        /***
         * Petit programme:
         * Créer une liste de string et supprimer les mots dépassant 5 caractères
         */
        System.out.println("#Petit Programme iterator.remove");
        ArrayList<String> mots = new ArrayList<>();
        mots.add("un");
        mots.add("deux");
        mots.add("trois");
        mots.add("quatre");
        mots.add("cinq");
        System.out.println("Affichage de la liste avant traitement");
        System.out.println(mots);
        Iterator<String> it = mots.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.length() > 5) {
//                it.remove();
                mots.remove(next);
            }
        }
        System.out.println("Affichage résultat du programme");
        System.out.println(mots);

        /***
         * Même programme en utilisant foreach
         */
        System.out.println("#Autre programme avec exception");
        ArrayList<Integer> entiers = new ArrayList<>();
        entiers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Affichage des entiers avant traitement");
        System.out.println(entiers);
        for (int entier : entiers) {
//            entiers.remove(entier);// Il est impossible de supprimer un élement de la liste avec cette métode
        }
        System.out.println("Affichage résultat");
        System.out.println(entiers);

        /***
         * Utilisation des indexes
         */
        System.out.println("#Utilisation des index dans liste");
        ArrayList<Integer> listEntiers = new ArrayList<>();
        listEntiers.add(0);
        listEntiers.add(1);
        listEntiers.add(2);
        listEntiers.add(5);
        listEntiers.add(3);
        System.out.println(listEntiers.get(2));
        System.out.println("#Suppression par indexe");
        System.out.println("Affichage de la liste");
        System.out.println(listEntiers);
        listEntiers.remove(3);
        System.out.println(listEntiers);
        System.out.println("Ajout avec add index ");
        listEntiers.add(1, 10);
        System.out.println("Affiche : " + listEntiers);
        System.out.println("Modification élément à un indice");
        listEntiers.set(1, 4);
        System.out.println("Affiche : " + listEntiers);
        System.out.println("Add index à un indice n'existant pas");
        listEntiers.add(5, 25);
        System.out.println("Affiche : " + listEntiers);
//        listEntiers.set(8, 47);
//        System.out.println("Affiche : " + listEntiers);

        /***
         * Création des collections préremplies
         */
        System.out.println("#Factory Arrays.asList");
        List<String> collections = Arrays.asList("one","twho","three");
        System.out.println("Affiche collections : " + collections);
//        collections.add(1,"four"); //unsupportedOperationException
//        System.out.println("Affiche collections : " + collections);
//        collections.remove(2); //unsupportedOperation
//        System.out.println("Affiche collections : " + collections);
        System.out.println("Replace all");
        collections.replaceAll(element -> element = "ok");
        System.out.println("Affiche collections : " + collections);
        System.out.println("Set");
        collections.set(0, "one");
        System.out.println("Affiche collections : " + collections);
        System.out.println("#Création des listes immutables avec List.of et Set.of");
        List<Integer> chiffres = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Affiche les chiffres : " + chiffres);
//        chiffres.add(10); //UnsupportedOperationException
//        System.out.println("Affiche les chiffres : " + chiffres);
//        chiffres.remove(2); //UnsupportedOperationException
//        System.out.println("Affiche les chiffres : " + chiffres);
//        chiffres.replaceAll(chiffre -> chiffre = 0); //UnsupportedOperationException
//        System.out.println("Affiche les chiffres : " + chiffres);

        /***
         * Copie d'une liste
         */
        System.out.println("#Copie d'une liste immutable");
        List<Integer> ents = List.of(1, 2, 3);
        ArrayList<Integer> entsCopy = new ArrayList<>(ents);
        System.out.println("Affichage entsCopy : " + entsCopy );
        System.out.println("Modification d'une liste immutable");
        entsCopy.add(4);
        System.out.println("Affichage entsCopy : " + entsCopy );

    }
}
