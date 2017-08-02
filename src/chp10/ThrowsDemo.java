package chp10;

/**
 * Created by bobsira on 8/2/17.
 */
public class ThrowsDemo {
    static void throwOne(){
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        throwOne();
    }
}
