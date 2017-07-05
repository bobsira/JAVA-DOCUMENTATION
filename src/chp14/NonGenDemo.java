package chp14;

/**
 * Created by bobsira on 7/5/17.
 * Demonstrate the non-generic class.
 */
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // Create NonGen Object and store
        // an Integer in it. Autoboxing still occurs.
        iOb = new NonGen(88);

        // Show the type of data used by iOb.
        iOb.showType();

        // Get the value of iOb.
        // This time, a cast is necessary.
        int v = (Integer) iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        //Create another NonGen object and
        //store a String in it.
        NonGen strOb=new NonGen("Non-Generics Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOB
        // Again, notice that a cast is necessary
        String str = (String) strOb.getOb();
        System.out.println("value: "+ str);

        //This complies, but is conceptually wrong!
        iOb=strOb;
        v=(Integer) iOb.getOb(); //run-time error!
    }
}
