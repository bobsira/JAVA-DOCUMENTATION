package chp18;

import java.util.LinkedList;

/**
 * Created by bobsira on 7/15/17.
 * Demonstrate LinkedList
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList =
                new LinkedList<String>();

        // Add elements to the linked list.
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");

        linkedList.add(1, "A2");

        System.out.println("Original contents of linkedList: " + linkedList);

        //Remove elements from the linked list.
        linkedList.remove("F");
        linkedList.remove(2);

        System.out.println("Contents of linkedList after deletion: " + linkedList);

        // Remove first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("linkedList after deleting first and last: " + linkedList);

        // Get and set a value.
        String val = linkedList.get(2);
        linkedList.set(2, val + " Changed");

        System.out.println("linkedList after change: " + linkedList);
    }
}
