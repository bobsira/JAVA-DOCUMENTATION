package chp18;

import java.util.ArrayList;

/**
 * Created by bobsira on 7/15/17.
 * Convert an ArrayList into an array
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an array list
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to the array list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        // Get the array.
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        // print out the array
        System.out.print("Contents of ai: [");
        for (int i : ia) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        int sum = 0;

        // sum the array
        for (int i : ia
                ) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
