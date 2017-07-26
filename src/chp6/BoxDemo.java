package chp6;

/**
 * Created by bobsira on 7/25/17.
 */
public class BoxDemo {
    public static void main(String[] args) {
// declare, allocate, and initialize Box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

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
