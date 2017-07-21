package chp18;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by bobsira on 7/21/17.
 * Demonstrate the Stack class
 */
public class StackDemo {
    static void showpush(Stack<Integer> stack, int a) {
        stack.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
        System.out.println();
    }

    static void showpop(Stack<Integer> stack) {
        System.out.print("pop -> ");
        Integer a = stack.pop();
        System.out.println(a);
        System.out.println("stack: " + stack);
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("stack: " + stack);
        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        showpop(stack);
        showpop(stack);
        showpop(stack);

        try {
            showpop(stack);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
