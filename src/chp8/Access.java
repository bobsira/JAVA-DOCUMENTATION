package chp8;

/**
 * Created by bobsira on 7/28/17.
 * In a class hierarchy, private members remain private to their class.
 * This program contains an error and will not compile.
 */
public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
