package chp14;

/**
 * Created by bobsira on 7/12/17.
 * Demonstrate a situation that requires a bridge method
 */
public class BridgeDemo {
    public static void main(String[] args) {

        // Create a Gen2 object for Strings.
        Gen1 strOb2 = new Gen1<>("Generics Test");

        System.out.println(strOb2.getOb());
    }
}
