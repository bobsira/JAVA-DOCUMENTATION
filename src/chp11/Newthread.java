package chp11;

/**
 * Created by bobsira on 8/4/17.
 * Create a second thread by extending Thread
 */
public class Newthread extends Thread{
    Newthread(){
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start();  // Start the thread
    }

    // This is the entry point for the second thread.
    public void rum(){
        try {
            for ( int i =5; i >0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
