package chp11;

/**
 * Created by bobsira on 8/10/17.
 * An incorrect implementation of a producer and consumer
 */
public class Q {
    int n;

    synchronized int get(){
        System.out.println("Got: " + n );
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: " + n );
    }
}
