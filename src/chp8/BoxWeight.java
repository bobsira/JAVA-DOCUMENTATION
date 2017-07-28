package chp8;

/**
 * Created by bobsira on 7/28/17.
 * Here, Box is extended to include weight
 *
 * BoxWeight now uses super to initialize its Box attributes
 *
 * BoxWeight now fully implements all constructors
 */
public class BoxWeight extends Box {
    double weight; // weight of box

    // constructor for BoxWeight
    // initialize width,height,depth using super()
    // constructor when all parameters are specified
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        //this.width = width;
        //this.height = height;
        //this.depth = depth;
        this.weight = weight;
    }

    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to the constructor
        super(ob);
        weight = ob.weight;
    }

    // default constructor
    BoxWeight() {
        super();
        this.weight = -1;
    }

    // constructor used when cube is created
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}
