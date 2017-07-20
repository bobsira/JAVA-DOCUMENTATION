package chp18;


import java.util.Comparator;

/**
 * Created by bobsira on 7/20/17.
 * custom comparator
 * A reverse comparator for Strings
 */
public class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String aStr, bStr;

        aStr = a;
        bStr = b;

        // reverse the comparison
        return bStr.compareTo(aStr);
    }

    // no need to override equals.
}
