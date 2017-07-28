package chp8;

/**
 * Created by bobsira on 7/28/17.
 * Add shipping costs.
 */
public class Shipment extends BoxWeight {
    double cost;

    // construct clone of an object
    Shipment(Shipment ob) { // pass object to constructor
        super(ob);
        cost = ob.cost;
    }

    // constructor when all parameters are specified
    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);  // call super class constructor
        this.cost = cost;
    }

    // default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // constructor when cube is created
    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}
