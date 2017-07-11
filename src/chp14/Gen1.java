package chp14;

/**
 * Created by bobsira on 7/10/17.
 * A subclass of Gen
 */
public class Gen1<T> extends Gen<T> {
    Gen1(T ob) {
        super(ob);
    }

    // Override getob()
    // Return ob.
    T getOb() {
        return ob;
    }
}
