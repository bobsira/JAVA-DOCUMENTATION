package chp5;

/**
 * Created by bobsira on 7/25/17.
 */
public class Continue {
    public static void main(String[] args) {

        int i;

        for (i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
