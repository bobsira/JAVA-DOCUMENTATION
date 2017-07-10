package chp14;

/**
 * Created by bobsira on 7/10/17.
 * A subclass of Gen that defines a second
 * type parameter, called V.
 */
public class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    V getOb2() {
        return ob2;
    }
}
