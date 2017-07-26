package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }


    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
