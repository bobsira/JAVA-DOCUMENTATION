package chp7;

/**
 * Created by bobsira on 7/27/17.
 */
public class UseStatic {
    static int a = 3;
    static int b;

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        meth(42);
    }
}
