package chp9;

/**
 * Created by bobsira on 7/31/17.
 */
abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
    // ...
}
