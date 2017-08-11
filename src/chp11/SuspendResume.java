package chp11;

/**
 * Created by bobsira on 8/12/17.
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread One");
            ob2.mysuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e ){
            System.out.println("Main thread Interrupted");
        }

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.thread.join();
            ob2.thread.join();
        } catch (InterruptedException e ){
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
