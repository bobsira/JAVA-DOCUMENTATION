package chp18;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by bobsira on 7/15/17.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Book> bookQueue = new PriorityQueue<Book>();

        // Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        //Adding Books to the queue
        bookQueue.add(b1);
        bookQueue.add(b2);
        bookQueue.add(b3);

        System.out.println("Traversing the queue elements.");
        // Traversing queue elements
        for (Book b : bookQueue
                ) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        System.out.println();
        bookQueue.remove();
        System.out.println("After removing one book record");
        for (Book b : bookQueue
                ) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
