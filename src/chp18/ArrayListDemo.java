package chp18;

import java.util.ArrayList;

/**
 * Created by bobsira on 7/15/17.
 * DEmonstrate ArrayList
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Initial size of al " + al.size());

        // Add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size of array list after additions: " + al.size());

        //Display the array list.
        System.out.println("Contents of al: " + al);

        //Remove elements from the array list
        al.remove("F");
        al.remove(2);

        System.out.println("size of the array list after deletions: " + al.size());

        System.out.println("Contents of al: " + al);

    }
}
