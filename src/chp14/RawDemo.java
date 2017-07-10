package chp14;

/**
 * Created by bobsira on 7/10/17.
 * Demonstrate raw type.
 */
public class RawDemo {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen<Integer> iob = new Gen<Integer>(88);

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Create a raw-type Gen object and give it
        // a Double value.
        Gen raw = new Gen(new Double(98.6));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // The use of raw type can lead to run-time
        // exceptions. Here are some examples.

        // The following cast causes a run-time error!
        //int i = (Integer) raw.getOb(); //run-time error

        // This assignment overrides type safety.
        strOb = raw;  //OK, but potentially wrong
        //String str = strOb.getOb(); // run-time error

        // This assignment also overrides type safety.
        raw = iob; //OK, but potentially wrong
        // d=(Double)raw.getOb(); // run-time error
    }
}
