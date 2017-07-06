package chp14;

/**
 * Created by bobsira on 7/6/17.
 * Four-dimensional coordinates.
 */
public class FourD extends ThreeD {
    int t;

    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
