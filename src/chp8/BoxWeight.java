package chp8;

/**
 * Created by bobsira on 7/28/17.
 * Here, Box is extended to include weight
 */
public class BoxWeight extends Box {
    double weight; // weight of box

    // constructor for BoxWeight
    BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}
