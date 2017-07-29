package chp8;

/**
 * Created by bobsira on 7/29/17.
 */
abstract public class X {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
