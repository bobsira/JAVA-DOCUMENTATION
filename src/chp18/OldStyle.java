package chp18;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bobsira on 7/21/17.
 * Pre-generics example that uses a collection
 */
public class OldStyle {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        /**
         * These lines store strings, but any type of object
         * can be stored. In old-style code, there is no
         * convenient way to restrict the type of objects stored
         * in a collection
         */
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        /**
         * wrong
         */
        list.add(new Integer(100));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            /**
             * To retrieve an element, an explicit type cast is needed
             * because the collection stores only object.
             */
            String string = (String) iterator.next(); // explicit cast needed here.

            System.out.println(string + " is " + string.length() + " chars long");
        }
    }
}
