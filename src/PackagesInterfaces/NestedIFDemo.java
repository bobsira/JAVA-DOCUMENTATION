package PackagesInterfaces;

/**
 * Created by bobsira on 6/13/17.
 */
public class NestedIFDemo {
    public static void main(String[] args) {
        //use a nested interface reference
        A.NestedIF nestedIF=new B();

        if (nestedIF.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nestedIF.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
