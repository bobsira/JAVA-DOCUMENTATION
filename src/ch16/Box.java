package ch16;

/**
 * Created by bobsira on 6/15/17.
 * Override toString() for Box class.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    @Override
    public String toString() {
        return "Dimensions are " + width + " by "+
                depth+ " by " + height + ".";
    }
}
