package chp14;

/**
 * Created by bobsira on 7/11/17.
 * Demonstrate generic method override
 */
public class OverrideDemo {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Create a Gen2 object for Integers.
        Gen1<Integer> iOb2 = new Gen1<Integer>(99);

        // Create a Gen2 object for Strings.
        Gen1<String> strOb2 = new Gen1<String>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());

    }
}
