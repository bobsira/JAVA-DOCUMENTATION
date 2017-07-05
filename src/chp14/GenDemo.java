package chp14;

/**
 * Created by bobsira on 7/5/17.
 * Demonstrate the generic class.
 */
public class GenDemo {
    public static void main(String[] args) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its
        // reference to iOb. Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.
        iOb=new Gen<Integer>(88);

        // Show the type of data used by iOd.
        iOb.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v =iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        // Create a Gen object for Strings
        Gen<String>strOb=new Gen<String>("Generics Test");

        // Show the type of data used by strOb
        strOb.showType();

        //Get the value of strOb. Again, notice
        //that no cast is needed
        String str=strOb.getOb();
        System.out.println("value "+ str);

        // Create a Gen object for Doubles
        Gen<Double>dOb=new Gen<Double>(45.35);

        // Show the type of data used by dOb
        dOb.showType();

        //Get the value of strOb. Again, notice
        //that no cast is needed
        Double db=dOb.getOb();
        System.out.println("value "+ db);
    }
}
