package chp11;

/**
 * Created by bobsira on 8/10/17.
 */
public class PC {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stop");
    }
}
