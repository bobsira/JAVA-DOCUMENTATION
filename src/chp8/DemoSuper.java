package chp8;

/**
 * Created by bobsira on 7/28/17.
 */
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();  // default
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double volume;

        volume = mybox1.volume();
        System.out.println("Volume of mybox1 is " + volume);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        volume = mybox2.volume();
        System.out.println("Volume of mybox2 is " + volume);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();

        volume = mybox3.volume();
        System.out.println("Volume of mybox3 is " + volume);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();

        volume = myclone.volume();
        System.out.println("Volume of myclone is " + volume);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();

        volume = mycube.volume();
        System.out.println("Volume of mycube is " + volume);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }
}
