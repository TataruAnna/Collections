package exercitii.positivenumbers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PositiveNumbers {
    public static void main(String[] args) {
       // System.out.println(extractPositiveNumbers(numbers1,numbers2)); //trebe definite listele

    }
    public static Set<Integer> extractPositiveNumbers(List<Integer> numbers1, List<Integer> numbers2){
        Set<Integer> result = new HashSet<>();
        for(Integer number : numbers1){
            if(number>=0){
                result.add(number);
            }
        }
        for(Integer number : numbers2){
            if(number>=0){
                result.add(number);
            }
        }

        return result;

    }
}
