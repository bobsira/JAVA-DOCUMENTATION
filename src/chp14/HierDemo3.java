package chp14;

/**
 * Created by bobsira on 7/11/17.
 * Demonstrate run-time type ID implications of generic
 * class hierarchy
 */
public class HierDemo3 {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Create a Gen1 object for Integers.
        Gen1<Integer> iOb2 = new Gen1<Integer>(99);

        // Create a Gen1 object for Strings.
        Gen1<String> strOb2 = new Gen1<String>("Generics Test");

        // See if iOb2 is some form of Gen2
        if (iOb2 instanceof Gen1<?>)
            System.out.println("iOb2 is instance of Gen1");

        // See if iOb2 is some form of Gen.
        if (iOb2 instanceof Gen<?>)
            System.out.println("iOb2 is instance ");

        System.out.println();

        // See if strOb2 is a Gen1.
        if (strOb2 instanceof Gen1<?>)
            System.out.println("strOb2 is instance of Gen");

        // See if strOb2 is a Gen.
        if (strOb2 instanceof Gen<?>)
            System.out.println("strOb2 is instance of Gen");

        System.out.println();

        // See if iOb is an instance of Gen1, which it is not.
        if (iOb instanceof Gen1<?>)
            System.out.println("iOb is instance of Gen1");

        // See if iOb is an instance of Gen, which it is
        if (iOb2 instanceof Gen1<?>)
            System.out.println("iOb is instance of Gen");

        // The following can't be compiled because
        // generic type info does not exist at run time.

        // if(iOb2 instanceof Gen2<Integer>)
        //    System.out.println("iOb2 is instance of Gen1<Integer>");
        
    }
}
