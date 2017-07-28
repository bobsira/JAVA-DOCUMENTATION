package chp8;

/**
 * Created by bobsira on 7/28/17.
 * create a superclass
 */
public class A {
    int i;  // public by default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
