package chp11;

import chp8.C;

/**
 * Created by bobsira on 8/10/17.
 */
public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stop");
    }
}
