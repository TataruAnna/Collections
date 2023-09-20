package exercitii.cypher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cypher {
    private List<Character> inputChars;
    private List<Character> outputChars;

    private Map<Character,Character> cypherMap;

    public List<Character> getInputChars() {
        return inputChars;
    }

    public void setInputChars(List<Character> inputChars) {
        this.inputChars = inputChars;
    }

    public List<Character> getOutputChars() {
        return outputChars;
    }

    public void setOutputChars(List<Character> outputChars) {
        this.outputChars = outputChars;
    }

    public Map<Character, Character> getCypherMap() {
        return cypherMap;
    }

    public void setCypherMap(Map<Character, Character> cypherMap) {
        this.cypherMap = cypherMap;
    }

    public Cypher(List<Character> inputChars, List<Character> outputChars) {
        this.inputChars = inputChars;
        this.outputChars = outputChars;
        cypherMap = new HashMap<>();
        initializeCypher();
    }

    public void initializeCypher(){
        for (int i = 0; i < inputChars.size() ; i++) {
            cypherMap.put(inputChars.get(i), outputChars.get(i));

        }
    }

    public String encrypt(String word){
        // parcurg cuvantul
        //pt fiecare litera
           //iau valoarea de la litera din mapa (key) si o adaug in cuvantul criptat
        String encriptedWord = ""
;
        for (Character c : word.toCharArray()){
            encriptedWord += cypherMap.get(c);
        }
            return encriptedWord;

    }

    public String decrypt(String word){
        String decryptedWord = "";

        // parcurg cuvantul
        //pt fiecare litera
        //caut unde este litera ca valoare in mapa
         //parcurg setul de key
         //verific daca cheia curenta are ca si valoare litera
        // daca da, adaug cheia de la acea valoare in decry

            for (Character c : word.toCharArray()) {
//                decryptedWord += getKeyFromValue(c);

//            for(Character key: cypherMap.keySet() ){
//                if(cypherMap.get(key).equals(c)){
//                    decryptedWord+=key;
//                }
//            }
            }

        return decryptedWord;

    }
    public Character getKeyFromValue(Character value) throws Exception{

    for(Character key: cypherMap.keySet() ){
        if(cypherMap.get(key).equals(value)){
            return key;
        }
    }
    throw new Exception("Cannot decode: invalid imput");
}



}
