package listsetmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> productsMap = new HashMap<>();
        productsMap.put(1000, "Notebook");
        productsMap.put(2000, "Phone");
        productsMap.put(3000, "Keyboard");
        productsMap.put(4000, null);

        System.out.println(productsMap);
        System.out.println(productsMap.get(1000));

        System.out.println(productsMap);
        productsMap.putIfAbsent(4000,"Mouse"); // ne pune la cheia 4000, daca valoare e diferita de Mouse, ne pune mouse ?
        System.out.println(productsMap.get(4000));
        System.out.println(productsMap.containsKey(4000)); // ne returneaza true sau false;

        for (Integer productCode: productsMap.keySet()){ // parcurg setul de coduri din productsMap
            System.out.println(productsMap.get(productCode)); //afisez valoarea de la product Code
        }

        for(String productName : productsMap.values()){
            System.out.println(productsMap); // se poate parcurge si prin valoare, dar se poate accesa doar valoarea
        }

        for (Map.Entry<Integer, String> entry: productsMap.entrySet()){ // creem o variabila entry de tip Entry din Map si cu ea parcurgem productsMap
            System.out.println(entry.getKey() + " "+ entry.getValue()); // parcurgem pe ambele valori si am acces la amandoua valori
        }

        Map<String, Set<String>> synonyms = new HashMap<>();

        Set<String> set1 = new HashSet<>();
        set1.add("mirobilant");

        Set<String> set2 = new HashSet<>();
        set2.add("perspicace");
        set2.add("iute");

        Set<String> set3 = new HashSet<>();
        set3.add("facil");
        set3.add("usor");

        synonyms.put("fantastic", set1);
        synonyms.put("rapid", set2);
        synonyms.put("simpplu", set3);
        System.out.println(synonyms.get("fantastic"));
        System.out.println(synonyms);

        String newString = "dezastruos";
        String newKey = "urat";

//        addToMap(newKey, newString, synonyms);
//        System.out.println(synonyms);

        //synonyms.putIfAbsent("mirobolant", set1);


    }

    public static void addToMap(String key, String newValue, Map<String,Set<String>> synonims){
        if(!synonims.containsKey(key)){
            Set<String> valueSet = new HashSet<>();
            valueSet.add(newValue);
            synonims.put(key, valueSet);
        }
        else{
            synonims.get(key).add(newValue);
        }
    }
}
