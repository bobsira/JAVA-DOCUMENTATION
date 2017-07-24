package chp5;

/**
 * Created by bobsira on 7/24/17.
 */
public class ForTick {
    public static void main(String[] args) {
        int n;

        for (n = 10; n > 0; n--)
            System.out.println("tick " + n);

        // here, n is declared inside of the for loop
        for (int k = 10; k > 0; k--)
            System.out.println("tick " + k);
    }
}
