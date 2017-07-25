package chp5;

/**
 * Created by bobsira on 7/25/17.
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return.");

        if (t) return;  // return to caller

        System.out.println("This won't execute");
    }
}
