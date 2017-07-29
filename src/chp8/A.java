package chp8;

/**
 * Created by bobsira on 7/28/17.
 * create a superclass
 *
 * Create a super class
 */
public class A {
    int i;  // public by default
    private int j; // private to A

    A() {
        System.out.println("Inside A's constructor.");
    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
