package chp6;

/**
 * Created by bobsira on 6/1/17.
 */
public class BoxDemo6 {
    public static void main(String args[]) {
// declare, allocate, and initialize Box1 objects
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
