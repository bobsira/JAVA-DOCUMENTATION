package chp8;

/**
 * Created by bobsira on 7/28/17.
 */
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // The superclass may be used by itself.
        superOb.i = 10;
        // superOb.j = 20; // Error, j is not accessible here
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        /**
         * The subclass has access to all public members of its superclass
         */
        subOb.i = 7;
        //  subOb.j = 8; // Error, j is not accessible here
        subOb.k = 9;

        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
    }
}
