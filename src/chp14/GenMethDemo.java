package chp14;

/**
 * Created by bobsira on 7/6/17.
 * // Demonstrate a simple generic method.
 */
public class GenMethDemo {
    // Determine if an object is in an array
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;
        return false;
    }

    public static void main(String[] args) {
        
    }
}
