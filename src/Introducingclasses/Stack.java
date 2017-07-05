package Introducingclasses;

/**
 * Created by bobsira on 6/1/17.
 * This class defines an integer stack that can hold 10 values.
 */
public class Stack {
    int stck[]=new int[10];
    int tos;

    // Initialize top-of-stack
    Stack(){
        tos=-1;
    }

    // Push an item onto the stack
    void push(int item){
        if (tos==9)
            System.out.println("Stack overflow");
        else
            stck[++tos]=item;
    }

    // Pop an item from the stack
    int pop(){
        if (tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
