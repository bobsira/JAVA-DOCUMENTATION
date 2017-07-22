package chp5;

/**
 * Created by bobsira on 7/22/17.
 */
public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        /**
         * Find the midpoint between i and j
         */

        while (++i < --j) ; // no body in the loop
        System.out.println("Midpoint is " + i);
    }
}
