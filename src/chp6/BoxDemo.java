package chp6;

/**
 * Created by bobsira on 7/25/17.
 */
public class BoxDemo {
    public static void main(String[] args) {
//        Box1 mybox = new Box1();
//        double vol;
//
//        //assigning values to mybox's instance variables
//        mybox.width=10;
//        mybox.height=20;
//        mybox.depth=15;
//
//        //compute volume of the box
//        vol=mybox.depth*mybox.height*mybox.width;
//        System.out.println("Volume is " + vol);
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        /**
         *  assign values to mybox1's instance variables
         */
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /**
         * assign different values to mybox2's
         * instance variables */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        /**
         * compute volume of first box
         */
//        vol = mybox1.width * mybox1.height * mybox1.depth;
//        System.out.println("Volume is " + vol);
//        mybox1.volume();
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        /**
         * compute volume of second box
         */
//        vol = mybox2.width * mybox2.height * mybox2.depth;
//        System.out.println("Volume is " + vol);
        // display volume of second box
//        mybox2.volume();
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);


    }
}
