package com.jinhogate.apicollection;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        /***
         * Création d'un map
         */
        System.out.println("#Création d'un map");
        Map<Integer, String> villes = new HashMap<>();
        villes.put(1, "paris");
        villes.put(3, "lille");
        villes.put(2, "bordeaux");
        villes.put(4, "strasbourg");
        villes.put(5, null);
        villes.put(6, "londres");
        System.out.println(villes);
        villes.put(3, "lyon"); //modification d'une valeur si la clé existe déjà
        System.out.println(villes);
        System.out.println("#Récupration d'une valeur par clé");
        System.out.println(villes.get(10)); // clé inexistante => null
        System.out.println(villes.getOrDefault(10, "none"));
        System.out.println(villes.get(5));
        System.out.println("#Remplacer une valeur");
        String londres = villes.putIfAbsent(6, "Kara");
        System.out.println(londres);
        System.out.println(villes);
        boolean replace = villes.replace(3, "accra", "lyon");
        System.out.println(replace);
        System.out.println(villes);
        System.out.println("#PutAll");
        HashMap<Integer, String> villesCopy = new HashMap<>(villes);
        villesCopy.put(1, "aneho");
        System.out.println(villesCopy);
        System.out.println("#Size");
        System.out.println(villes.size());
        System.out.println("#Clear");
        villesCopy.clear();
        System.out.println(villesCopy + "{" + villesCopy.size() + "}");
        System.out.println("#ContainsKeay");
        System.out.println(villes.containsKey(4));
        System.out.println("#ContainsValue");
        System.out.println(villes.containsValue("paris"));
        /***
         * itération sur map
         */
        System.out.println("# la liste des clés");
        Set<Integer> villeKeys = villes.keySet();
        Iterator<Integer> villeKeysIt = villeKeys.iterator();
        while (villeKeysIt.hasNext()){
            System.out.println(villeKeysIt.next());
        }
        System.out.println("#Itération sur la liste des valeurs");
        Collection<String> villeValues = villes.values();
        for(String ville: villeValues){
            System.out.println(ville);
        }
        System.out.println("#MapEntrySet");
        Set<Map.Entry<Integer, String>> villeEntries = villes.entrySet();
        System.out.println(villeEntries);
        for(Map.Entry keyVal: villeEntries) {
            if(keyVal.getKey().equals(1)){
                keyVal.setValue("dakar");
            }
            System.out.println("key: " + keyVal.getKey() + " value: " + keyVal.getValue());
        }
        System.out.println("#tri des clés");
        HashMap<Integer, String> pays = new HashMap<>();
        pays.put(228, "togo");
        pays.put(33, "france");
        pays.put(249, "allemagne");
        pays.put(233, "ghana");
        pays.put(229, "benin");
        System.out.println(pays);
        System.out.println(pays.keySet());
        System.out.println("#sortedMap");
        TreeMap<Integer, String> paysTrie = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        paysTrie.put(228, "togo");
        paysTrie.put(33, "france");
        paysTrie.put(249, "allemagne");
        paysTrie.put(233, "ghana");
        paysTrie.put(229, "benin");
        System.out.println("Affiche pays trie : " + paysTrie);
        System.out.println("Affiche clé pays trie: " + paysTrie.keySet());
        System.out.println("#construction de map et init");
        Map<Integer, String> nombres = Map.of(1, "un", 2, "deux");
        System.out.println(nombres);
//        nombres.put(3, "trois"); //UnSupportedOperationException
//        System.out.println(nombres);
        Map<Integer, String> immutableMaps = Map.ofEntries(Map.entry(1, "un"), Map.entry(2, "deux"));
        System.out.println(immutableMaps);
    }
}
