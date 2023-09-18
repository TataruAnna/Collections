package listsetmap;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>(); // setul, spre deosebire de array sau List, nu permite duplicate
        countries.add("India");
        countries.add("Japan");
        countries.add("India");
        System.out.println(countries);
        System.out.println(countries.contains("Japan")); //returneaza true sau false
        for(String country : countries){
            System.out.println(country);
        }
        // la Set nu avem indexi, nu putem parcurge cu fori, doar cu for each



    }
}
