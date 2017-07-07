package chp14;

/**
 * Created by bobsira on 7/7/17.
 * Use a generic constructor
 */
public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}
