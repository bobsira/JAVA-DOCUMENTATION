package chp9;


/**
 * Created by bobsira on 6/12/17.
 */
class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();


        c.callback(42);

        c = ob; // c now refers to AnotherClient object
        c.callback(42);
    }
}
