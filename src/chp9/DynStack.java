package chp9;

import PackagesInterfaces.IntStack;

/**
 * Created by bobsira on 6/13/17.
 * Implement a "growable" stack.
 */
public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    //allocate and initialize stack
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //push an item onto the stack
    @Override
    public void push(int item) {
        //if stack is full, allocate a larger stack
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];//double length
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

    //pop an item from the stack
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}
