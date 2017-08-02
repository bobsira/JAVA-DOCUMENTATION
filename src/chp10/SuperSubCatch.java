package chp10;

/**
 * Created by bobsira on 8/2/17.
 * This program contains an error
 *
 * A subclass must come before its superclass in
 * a series of catch statements. If not,
 * unreachable code will be created and a
 * compile-time error will result
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a =0;
            int b = 42/ a;
        }
        catch(ArithmeticException e){ // ERROR - unreachable
            System.out.println("This is never reached");
        } catch (Exception e){
            System.out.println("Generic Exception catch.");
        }

    }
}
