package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 10; i++) mystack2.push(i);

        // pop those numbers onto the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.pop() + " ");

        System.out.println();

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack2.pop() + " ");

        Stack mystack3 = new Stack(5);
        Stack mystack4 = new Stack(8);
        // push some numbers onto the stack
        for (int i = 0; i < 5; i++) mystack3.push(i);
        for (int i = 0; i < 8; i++) mystack4.push(i);
        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.print(mystack3.pop() + " ");

        System.out.println();

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.print(mystack4.pop() + " ");

        // these statement are not legal
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}
