package chp9;

/**
 * Created by bobsira on 6/12/17.
 */
public class Client implements Callback {
    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

}
