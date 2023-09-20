package exercitii.anagrame;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String word1 = "race";
        String word2 = "care";

//        Map<Character, Integer> firstWordMap = generateMap(word1);
//        Map<Character, Integer> secondWordMap = generateMap(word2);
//
//        if(firstWordMap.equals(secondWordMap)){
//            System.out.println("anagrams");
//        }else{
//            System.out.println("not anagrams");
//        }

        System.out.println(areAnagrams(word1,word2));

    }

    public static boolean areAnagrams(String word1, String word2){
        Map<Character, Integer> firstWordMap = generateMap(word1);
        Map<Character, Integer> secondWordMap = generateMap(word2);

        return (firstWordMap.equals(secondWordMap));

    }
    public static Map<Character,Integer> generateMap(String word){
        Map<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i< word.length(); i++){
            //fiecare litera o adaugam in map
            Character currentLetter = word.charAt(i);
            if(wordMap.containsKey(currentLetter)){
                wordMap.put(currentLetter, wordMap.get(currentLetter)+1);
            }
            else{
                wordMap.put(currentLetter,1);
            }
        }
        return wordMap;
    }
}
