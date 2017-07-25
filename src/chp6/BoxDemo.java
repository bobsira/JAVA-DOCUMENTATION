package chp6;

/**
 * Created by bobsira on 7/25/17.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box1 mybox = new Box1();
        double vol;

        //assigning values to mybox's instance variables
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;

        //compute volume of the box
        vol=mybox.depth*mybox.height*mybox.width;
        System.out.println("Volume is " + vol);
    }
}
