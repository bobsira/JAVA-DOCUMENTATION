package chp8;

/**
 * Created by bobsira on 7/28/17.
 */
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double volume;

        volume = boxWeight.volume();
        System.out.println("Volume of boxWeight is " + volume);
        System.out.println("Weight of boxWeight is " + boxWeight.weight);
        System.out.println();

        // assign boxWeight reference to Box reference
        plainbox = boxWeight;

        volume = plainbox.volume();  // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + volume);

        /**
         * The following statement is invalid because plainbox
         * does not define a weight member.
         */
        // System.out.println("Weight of plainbox is " + plainbox.weight );
    }
}
