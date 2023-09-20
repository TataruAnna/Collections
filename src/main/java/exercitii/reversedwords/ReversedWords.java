package exercitii.reversedwords;

import java.util.ArrayList;
import java.util.List;

public class ReversedWords {
    public static void main(String[] args) {
//Primeste ca si parametru o lista de cuvinte si returneaza lista de cuvinte inversata,
// cu mentiunea ca lista inversata nu va include cuvintele care au lungimea mai mica decat 3
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("nu");
        words.add("are");
        words.add("mere");
        System.out.println(getReversedWords(words));
    }
    public static List<String> getReversedWords(List<String>words){
        List<String> reversedWords = new ArrayList<>();
        for (int i = words.size()-1; i >=0 ; i--) {
            if(words.get(i).length()>=3){
                reversedWords.add(words.get(i));

            }
        }
        return reversedWords;
    }
}
