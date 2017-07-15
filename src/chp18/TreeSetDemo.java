package chp18;

import java.util.TreeSet;

/**
 * Created by bobsira on 7/15/17.
 * It creates a collection that uses a tree for storage.
 * Objects are stored in sorted, ascending order
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> treeSet = new TreeSet<>();


        // Add elements to the tree set.
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        System.out.println(treeSet);

        System.out.println(treeSet.subSet("C", "F"));
    }
}
