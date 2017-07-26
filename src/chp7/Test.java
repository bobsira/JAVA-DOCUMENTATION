package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test() {

    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
