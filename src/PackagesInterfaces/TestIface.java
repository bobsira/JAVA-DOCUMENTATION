package PackagesInterfaces;

/**
 * Created by bobsira on 6/12/17.
 */
class TestIface {
    public static void main(String[] args) {
        Callback c=new Client();
        c.callback(42);
    }
}
