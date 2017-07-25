package chp6;

/**
 * Created by bobsira on 7/25/17.
 */
public class Box {
    double width;
    double height;
    double depth;

    /**
     * display volume of a box
     */
//    public void volume() {
//        System.out.print("Volume is ");
//        System.out.println(width * height * depth);
//    }

    /**
     * compute and return volume
     *
     * @return
     */
    public double volume() {
        return width * height * depth;
    }

    /**
     * sets dimensions of box
     *
     * @param w
     * @param h
     * @param d
     */
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
