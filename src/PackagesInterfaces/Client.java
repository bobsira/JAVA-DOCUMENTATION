package PackagesInterfaces;

/**
 * Created by bobsira on 6/12/17.
 */
public class Client implements Callback {
    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    /**
     * It is both permissible and common for classes that implement interfaces to define
     * additional members of their own.
     */
    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}
