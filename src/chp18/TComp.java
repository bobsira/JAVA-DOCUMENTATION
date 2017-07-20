package chp18;

import java.util.Comparator;

/**
 * Created by bobsira on 7/20/17.
 * use a comparator to sort accounts by last name.
 * compare last whole words in two strings
 */
public class TComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;

        aStr = a;
        bStr = b;

        /**
         * Find index of beginning of last name
         */
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) // last name match, check entire name
            return aStr.compareTo(bStr);
        else
            return k;
    }

    // No need to override equals
}
