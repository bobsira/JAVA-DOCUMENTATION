package chp18;

import java.util.Collections;
import java.util.*;

/**
 * Created by bobsira on 7/19/17.
 */
public class ObjectSortingExample {
    public static void main(String[] args) {
        int[] integerArray = {1, 0, 3, 2};
        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));

        String[] stringArray = {"J", "A", "V", "A", "C"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        List stringList = new ArrayList();
        stringList.add("J");
        stringList.add("A");
        stringList.add("V");
        stringList.add("A");
        stringList.add("C");

        Collections.sort(stringList);
        for (Object elem : stringList) System.out.print(" " + elem);
    }
}
