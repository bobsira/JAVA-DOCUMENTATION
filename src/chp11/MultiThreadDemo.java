package chp11;

/**
 * Created by bobsira on 8/7/17.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("One");
        new NewThread2("Two");
        new NewThread2("Three");

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main Thread exiting.");
    }
}
