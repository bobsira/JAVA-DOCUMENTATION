package chp10;

import java.util.Random;

/**
 * Created by bobsira on 8/2/17.
 */
public class HandleError {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random random = new Random();

        for (int i=0; i<32000; i++){
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e){
                System.out.println("Division by zero.");
                System.out.println("Exception: " + e);
                a = 0; // set a to zero and continue
            }
            System.out.println("a: " +a);
        }
    }
}
