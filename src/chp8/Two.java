package chp8;

/**
 * Created by bobsira on 7/28/17.
 */
public class Two extends One {
    int i; // this i hides the i in One

    Two(int a, int b) {
        super.i = a; // i in One
        i = b;  // i in Two
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
