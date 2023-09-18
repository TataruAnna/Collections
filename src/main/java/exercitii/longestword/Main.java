package exercitii.longestword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfWords = Arrays.asList("ana", "are", "mere");
        Words words = new Words(listOfWords);
        System.out.println(words.longestWord());
    }
}
