package exercitii.countwords;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ana", "are","mere","are");
        System.out.println(groupWordsByFrequency(words));

    }

    public static Map<String, Integer> groupWordsByFrequency (List<String> words){
        Map<String, Integer> wordsByFrequancy = new HashMap<>();
        //parcurg lista si pt fiecare element:
           //daca este deja acea cheie in mapa , cresc valoarea cu 1
          // daca nu, adaug cheia in mapa
        for(String word : words){
            if(wordsByFrequancy.containsKey(word)){
                wordsByFrequancy.put(word, wordsByFrequancy.get(word)+1);
            }
            else{
                wordsByFrequancy.put(word,1);
            }
        }
        return wordsByFrequancy;

    }
}
