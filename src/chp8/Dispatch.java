package chp8;

/**
 * Created by bobsira on 7/29/17.
 */
public class Dispatch {
    public static void main(String[] args) {
        A a = new A(); // object of type A
        B b = new B(); // object of type B
        D c = new D(); // object of type C

        A r;  // obtain a reference of type A

        r = a; // r refers to an A object
        r.callme(); // call A's version of callme

        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme

        r = c; // r refers to a D object
        r.callme(); // call's D's version of callme
    }
}
