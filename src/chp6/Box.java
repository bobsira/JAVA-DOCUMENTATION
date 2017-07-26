package chp6;

/**
 * Created by bobsira on 7/25/17.
 */
public class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /**
     * compute and return volume
     *
     * @return
     */
    public double volume() {
        return width * height * depth;
    }

}
