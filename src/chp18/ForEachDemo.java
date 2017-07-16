package chp18;

import java.util.ArrayList;

/**
 * Created by bobsira on 7/16/17.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        // Create an array list for integers
        ArrayList<Integer> vals = new ArrayList<>();

        // Add values to the array list.
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Use for loop to display the values.
        System.out.println("Contents of vals: ");
        for (int v : vals
                ) {
            System.out.print(v + " ");
        }
        System.out.println();

        //Now,sum the values by using a for loop
        int sum = 0;
        for (int v : vals
                ) {
            sum += v;
        }
        System.out.println("Sum of values: " + sum);
    }
}
