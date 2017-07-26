package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class TestAccess {
    public int b; // public access
    int a; // default access
    private int c; // private access

    int getC() {// get c's value
        return c;
    }

    // methods to access c
    void setC(int i) { // set c's value
        c = i;
    }
}
