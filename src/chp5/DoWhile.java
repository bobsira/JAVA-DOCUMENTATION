package chp5;

/**
 * Created by bobsira on 7/24/17.
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 10);

        /**
         * efficient way of writing the code
         */
//        do {
//            System.out.println("tick " + n);
//        } while ( --n > 0);
    }
}
