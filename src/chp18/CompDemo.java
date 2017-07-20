package chp18;

import java.util.TreeSet;

/**
 * Created by bobsira on 7/20/17.
 */
public class CompDemo {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> treeSet =
                new TreeSet<String>(new MyComp());

        // Add elements to the tree set
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        // Display the elements.
        for (String element : treeSet
                ) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
