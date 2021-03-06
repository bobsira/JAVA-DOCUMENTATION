package chp8;

/**
 * Created by bobsira on 7/29/17.
 */
abstract class Figure {
    protected double dim1;
    protected double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // area is now abstract method
    abstract double area();
//    double area() {
//        System.out.println("Area for Figure is undefined.");
//        return 0;
//    }
}
