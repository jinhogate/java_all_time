package com.jinhogate.apicollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueClasse {

    public static void main(String[] args) {
        List<Integer> entiers = new LinkedList<>();
        entiers.add(0);
        entiers.add(1);
        entiers.add(2);
        System.out.println("Affiche entiers : " + entiers);
        System.out.println("Début de la list");
        System.out.println("Debut = " + entiers.getFirst());
        System.out.println("Ajout au début");
        entiers.addFirst(-1);
        System.out.println("Affiche entiers : " + entiers);
        System.out.println("Debut = " + entiers.getFirst());
        System.out.println("Supprimer un élément au milieu de la liste");
        entiers.remove(1);
        System.out.println("Affiche entiers : " + entiers);
        System.out.println("Renvoi l'index de l'element trouvé");
        Integer i = entiers.get(0);
        System.out.println("Valeur à l'index 0 : " + i);
        System.out.println("la taille de la liste chainée");
        System.out.println("Taille de la liste : " + entiers.size());
        System.out.println("Renverser l'affichage");
        System.out.println(entiers.reversed());
        System.out.println(entiers.getFirst());
        System.out.println("parcourir la liste chainée");
        Iterator<Integer> iterator = entiers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /**
         * Implémentation de queue
         */
        Queue<String> chiffres = new LinkedList<>();
        chiffres.offer("zero");
        chiffres.add("un");
        chiffres.add("deux");
        chiffres.add("trois");
        chiffres.add("quatre");
        chiffres.add("cinq");
        chiffres.offer("six");
        System.out.println("#Affiches chiffres : " + chiffres);
        System.out.println("Premier element de la queue");
        System.out.println(chiffres.peek());
        System.out.println("Supprimer le premier element de la queue");
        chiffres.poll();
        System.out.println("#Affiches chiffres : " + chiffres);

    }
}
