package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class Stack {
    /**
     * Now, both stck and tos are private. This means
     * that they cannot be accidentally or maliciously
     * altered in a way that would be harmful to the stack
     */

    private int stck[] = new int[10];
    private int tos;

    // allocate and initialize stack
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Initialize the top of the stack
    Stack() {
        tos = -1;
    }

    // push an item onto the stack
    void push(int item) {
        if (tos == stck.length - 1) // use length member
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    // pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}
