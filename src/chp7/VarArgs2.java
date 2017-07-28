package chp7;

/**
 * Created by bobsira on 7/28/17.
 */
public class VarArgs2 {
    // Here, msg is a normal parameter and v is a
    // varargs parameter
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Contents ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three vararg: ", 1, 2, 3);
        vaTest("No vararg: ");
    }
}
