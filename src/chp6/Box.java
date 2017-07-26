package chp6;

/**
 * Created by bobsira on 7/25/17.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
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
