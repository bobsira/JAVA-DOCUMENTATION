package chp10;

/**
 * Created by bobsira on 8/2/17.
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
