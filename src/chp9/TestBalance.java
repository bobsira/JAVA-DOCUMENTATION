package chp9;

/**
 * Created by bobsira on 6/12/17.
 */

import chp9.MyPack.*;

public class TestBalance {
    public static void main(String[] args) {
        /* Because Balance is public, you may use Balance
        class and call its constructor. */
        Balance test = new Balance("J. J. Jaspers", 99.88);
        test.show(); // you may also call show()
    }
}
