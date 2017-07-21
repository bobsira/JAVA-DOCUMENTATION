package chp18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by bobsira on 7/21/17.
 * Demonstrate various algorithms
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {

        /**
         * Create and initialize linked list.
         */
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);
        linkedList.add(28);

        /**
         * Create a reverse order comparator.
         */
        Comparator<Integer> comparator = Collections.reverseOrder();

        /**
         * Sort list by using the comparator
         */
        Collections.sort(linkedList, comparator);

        System.out.print("List sorted in reverse: ");
        for (int i : linkedList)
            System.out.print(i + " ");

        System.out.println();

        /**
         * Shuffle list
         */
        Collections.shuffle(linkedList);

        /**
         * Display randomized list.
         */
        System.out.print("List shuffled: ");
        for (int i : linkedList)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Minimum: " + Collections.min(linkedList));
        System.out.println("Maximum: " + Collections.max(linkedList));
    }
}
