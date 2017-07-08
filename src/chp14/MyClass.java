package chp14;

/**
 * Created by bobsira on 7/8/17.
 * Now, implement MinMax
 */
public class MyClass<T extends Comparable<T>> implements MinMax {
    T[] vals;

    MyClass(T[] vals) {
        this.vals = vals;
    }

    //Return the minimum value in vals.
    @Override
    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0) v = vals[i];

        return v;
    }

    // Return the maximum value in vals.
    @Override
    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0) v = vals[i];

        return v;
    }
}
