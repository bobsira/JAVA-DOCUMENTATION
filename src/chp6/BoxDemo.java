package chp6;

/**
 * Created by bobsira on 6/1/17.
 *
 */


/** A program that uses the Box class.
 * Call this file BoxDemo.java
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox=new Box();
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
