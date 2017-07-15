package chp18;

import java.util.ArrayDeque;

/**
 * Created by bobsira on 7/15/17.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an array deque.
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Use an ArrayDeque like a stack.
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        //Traversing elements
        for (String str : arrayDeque) {
            System.out.print(str + " ");
        }

        System.out.println("\n");

        System.out.println("Popping the stack: ");

        while (arrayDeque.peek() != null)
            System.out.print(arrayDeque.pop() + " ");


    }
}
