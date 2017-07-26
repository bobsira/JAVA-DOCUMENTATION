package chp7;

/**
 * Created by bobsira on 7/26/17.
 */
public class Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // use -1 to indicate
    // an uninitialized
    // box
    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
