package chp16;

/**
 * Created by bobsira on 6/15/17.
 */
public class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box1 b: " + b; // concatenate Box1 object
        System.out.println(b); // convert Box1 to string
        System.out.println(s);
    }
}
