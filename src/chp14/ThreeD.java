package chp14;

/**
 * Created by bobsira on 7/6/17.
 * Three-dimensional coordinates.
 */
public class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
