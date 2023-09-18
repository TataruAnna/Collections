package exercitii.spellchecker;

import java.util.*;

public class SpellCheck {
    public static void main(String[] args) {
        //citim n- numarul de cubinte din dictionar
        //citim de pe fiecare linie de n ori cate un cuvant si il bagam in dictionar
        //citim m - numarul de linii de text
        //citim fiecare linie de text de m ori
            //citim fiecare cuvant din linia curenta si il bagam in wordFromText - lista de cuvinte
        //gasim cuvintele gresite din wordsFromText - algoritmul propriu zis

       Set<String> dictionary = new HashSet<>();
       List<String> wordsFromText = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number of Words from dictionary:");
       int numberOfWordsFromDictionary = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfWordsFromDictionary ; i++) {
            System.out.println("Enter the next word in dictionary");
            String word = scanner.nextLine();
            dictionary.add(word);
        }
        System.out.println("dictionary is: " + dictionary);
        System.out.println("Enter number of text lines: ");
        int numberOfTextLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfTextLines; i++) {
            System.out.println("Enter the next text line: ");
            String line = scanner.nextLine();
            String[] wordsFromLine = line.split(" ");
            for( int j=0;j<wordsFromLine.length;j++){
                wordsFromText.add(wordsFromLine[j]);
            }
        }
        System.out.println("words from dictionary are: "+ wordsFromText);
    }
}
