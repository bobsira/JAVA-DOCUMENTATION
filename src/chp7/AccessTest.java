package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class AccessTest {
    public static void main(String[] args) {
        TestAccess ob = new TestAccess();

        // These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // This is not OK and will cause an error
        // ob.c = 100;  //ERROR!

        // You must access c through its methods
        ob.setC(100);  //OK
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
