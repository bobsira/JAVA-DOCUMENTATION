package chp5;

/**
 * Created by bobsira on 7/25/17.
 */
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10) break; // terminate loop if i is 10
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete");
    }
}