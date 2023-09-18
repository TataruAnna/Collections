package listsetmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListeExample {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(2);
        prices.add(3);
        prices.add(4);
        System.out.println(prices);
        prices.set(1,5);
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));

        }

        for(Integer price: prices){
            System.out.println(price);
        }
        List<String> imutableList = Arrays.asList("abc","cbcb","dhs");
        imutableList.add(2,"qqq");
        System.out.println(imutableList);
    }



}
