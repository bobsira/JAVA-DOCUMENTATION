package chp8;

import java.lang.*;
import java.lang.Override;

/**
 * Created by bobsira on 7/29/17.
 */
public class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    // override area for right triangle
    @Override
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
