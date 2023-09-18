package exercitii.longestword;

import java.util.List;

public class Words {
    private List<String> words;

    public Words(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public String longestWord(){
        String longestWord = "";
        for(String word : words){
            if(longestWord.length()<word.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }
}
