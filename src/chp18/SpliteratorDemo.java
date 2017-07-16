package chp18;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Created by bobsira on 7/16/17.
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        // Create an array list for doubles.
        ArrayList<Double> vals = new ArrayList<>();

        // Add values to the array list
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Use tryAdvance() to display contents of vals.
        System.out.print("Contents of vals:\n");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.print(n + " "))) ;
        System.out.println();

        // Create new list that contains square roots.
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        //Use forEachRemaining() to display contents of sqrs.
        System.out.print("Contents of sqrs:\n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
