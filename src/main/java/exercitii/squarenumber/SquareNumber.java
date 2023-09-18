package exercitii.squarenumber;

import java.util.ArrayList;
import java.util.List;

public class SquareNumber {

       private List<Integer> originalNumbers;

    public SquareNumber(List<Integer> originalNumbers) {
        this.originalNumbers = originalNumbers;
    }

    public List<Integer> getOriginalNumbers() {
        return originalNumbers;
    }

    public void setOriginalNumbers(List<Integer> originalNumbers) {
        this.originalNumbers = originalNumbers;
    }

    public  List<Integer> squareNumbers(){
        List<Integer> result = new ArrayList<>();
       for (int number : originalNumbers){

          result.add((int) Math.pow(number,2));

       }
       return result;
    }
}
