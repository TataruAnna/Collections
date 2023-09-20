package exercitii.supersets;

import java.util.HashSet;
import java.util.Set;

public class SuperSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("ana");
        set1.add("are");
        set1.add("mere");
        set1.add("rosii");
        set1.add("verzi");

        Set<String> set2 = new HashSet<>();
        set2.add("ana");
        set2.add("are");
        set2.add("mere");

        System.out.println(isSetSuperset(set1,set2));
    }
    public static boolean isSetSuperset(Set<String> set1, Set<String> set2){
       if (!set1.containsAll(set2)){
           return false;
        }
       return true;
    }
}
