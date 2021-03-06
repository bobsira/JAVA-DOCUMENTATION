package chp11;

/**
 * Created by bobsira on 8/4/17.
 * Controlling the main Thread
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("current thread: " + thread);

        // change the name of the thread
        thread.setName("My Thread");
        System.out.println("After name change: " +thread);

        try {
            for (int n =5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
