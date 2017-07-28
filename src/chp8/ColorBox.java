package chp8;

/**
 * Created by bobsira on 7/28/17.
 */
public class ColorBox extends Box {
    int color; // color of box

    ColorBox(double width, double height, double depth, int color) {
        super(width, height, depth);
        //this.width = width;
        //this.height = height;
        //this.depth = depth;
        this.color = color;
    }
}
