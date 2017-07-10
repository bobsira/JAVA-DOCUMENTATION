package chp14;

/**
 * Created by bobsira on 7/10/17.
 * A generic subclass
 */
public class Gen3<T> extends NonGen2 {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen3(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}
