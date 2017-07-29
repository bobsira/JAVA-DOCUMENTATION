package chp8;

import java.lang.*;
import java.lang.Override;

/**
 * Created by bobsira on 7/29/17.
 */
public class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    // override area for rectangle
    @Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return super.dim1 * dim2;
    }
}
