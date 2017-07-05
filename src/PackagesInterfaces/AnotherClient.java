package PackagesInterfaces;

/**
 * Created by bobsira on 6/13/17.
 */
public class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
