package chp7;

/**
 * Created by bobsira on 7/28/17.
 */
public class VarArgs4 {
    // Varargs, overloading, and ambiguity
    // This program contains an error and will
    // not compile!

    static void vaTest(int... v) {
        System.out.print("vaTest (int ...): " +
                "Number of args: " + v.length +
                " Contents: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest (boolean ...): " +
                "Number of args: " + v.length +
                " Contents: ");

        for (boolean x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); //OK

        //vaTest();  // Error : Ambiguous
    }

    /**
     * Another example of ambiguity
     *
     * static void vaTest(int ...v) { //... }
     *
     * static void vaTest(int n, int ...v) { //...}
     *
     * vaTest(1) //Error
     */
}
