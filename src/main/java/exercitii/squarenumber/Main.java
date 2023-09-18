package exercitii.squarenumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        SquareNumber numbersToBeSquare = new SquareNumber(numbers);
        System.out.println(numbersToBeSquare.squareNumbers());
    }
}
