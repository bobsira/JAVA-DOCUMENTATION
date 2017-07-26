package chp6;

/**
 * Created by bobsira on 6/1/17.
 */


/** A program that uses the Box1 class.
 * Call this file BoxDemo0.java
 */
public class BoxDemo0 {
    public static void main(String[] args) {
        Box1 mybox = new Box1();
        double vol;

        //assigning values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //compute volume of the box
        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("Volume is " + vol);
    }
}
