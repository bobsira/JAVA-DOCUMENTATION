package chp14;

/**
 * Created by bobsira on 7/8/17.
 * A generic interface example.
 * A Min/Max interface
 */
interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}
