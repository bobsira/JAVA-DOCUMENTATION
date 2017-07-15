package chp18;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by bobsira on 7/15/17.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.add("Rahul");
        priorityQueue.add("Amit");
        priorityQueue.add("Vijay");
        priorityQueue.add("Karan");
        priorityQueue.add("Jai");


        System.out.println("Head: " + priorityQueue.element());
        System.out.println("Head: " + priorityQueue.peek());

        System.out.println("Iterating the queue elements:");
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        priorityQueue.remove();
        priorityQueue.poll();

        System.out.println("After removing two elements");
        Iterator iterator1 = priorityQueue.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
    }
}
