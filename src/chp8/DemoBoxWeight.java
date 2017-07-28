package chp8;

/**
 * Created by bobsira on 7/28/17.
 */
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.4);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double volume;

        volume = mybox1.volume();
        System.out.println("Volume of mybox1 is " + volume);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        volume = mybox2.volume();
        System.out.println("Volume of mybox2 is " + volume);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}
