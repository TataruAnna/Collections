package comparingcollections;

import java.util.Comparator;

public class MintYearComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        return  Integer.compare(o1.getMintYear(), o2.getMintYear());
    }
}
