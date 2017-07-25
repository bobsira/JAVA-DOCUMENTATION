package chp5;

/**
 * Created by bobsira on 7/25/17.
 */
public class Search {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = 5;
        boolean found = false;

        // use for-each style for to search nums for vals
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Value found!");
    }
}
