package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("Factorial of 3 is " + factorial.fact(3));
        System.out.println("Factorial of 4 is " + factorial.fact(4));
        System.out.println("Factorial of 5 is " + factorial.fact(5));
    }
}
