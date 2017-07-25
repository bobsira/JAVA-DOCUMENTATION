package chp5;

/**
 * Created by bobsira on 7/25/17.
 */
public class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 1; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
