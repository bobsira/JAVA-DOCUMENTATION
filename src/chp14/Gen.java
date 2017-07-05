package chp14;

/**
 * Created by bobsira on 7/5/17.
 * A simple generic class.
 * Here, T is a type parameter that
 * will be replaced by a real type
 * when an object of type Gen is created.
 */

public class Gen<T> {
    T ob; //declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen(T ob) {
        this.ob = ob;
    }

    // Return ob.
    T getOb() {
        return ob;
    }

    //show type of T
    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
}
