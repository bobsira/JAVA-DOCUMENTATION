package chp9;

/**
 * Created by bobsira on 8/1/17.
 * Implement MYIF
 *
 */

public class MyIFImp implements MyIF {

    // Only getNumber() defined by MyIF needs to be implemented.
    // getString() can be allowed to default
    @Override
    public int getNumber() {
        return 100;
    }
}
