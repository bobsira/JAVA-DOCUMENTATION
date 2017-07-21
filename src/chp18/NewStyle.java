package chp18;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bobsira on 7/21/17.
 * Modern, generics version
 */
public class NewStyle {
    public static void main(String[] args) {

        /**
         * Now, list holds references of type String
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        /**
         * Notice that Iterator is also generic.
         */
        Iterator<String> iterator = list.iterator();

        //The following statement will cause a compile-time error.
        //Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            String string = iterator.next();  // no cast needed

            /**
             * Now the following line is a compile-time,
             * rather than a run-time error.
             */
            // Integer i = iterator.next(); // this will not compile
            System.out.println(string + " is " + string.length() + " chars long.");
        }
    }
}
