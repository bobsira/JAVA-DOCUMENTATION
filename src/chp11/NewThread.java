package chp11;

/**
 * Created by bobsira on 8/4/17.
 * Create a second thread.
 */
public class NewThread implements Runnable{
    Thread thread;

    NewThread(){
        // Create a new second thread
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + thread );
        thread.start(); // start the thread
    }

    // This is the entry point for the second thread.
    public void run(){
        try {
            for (int i =5; i > 0; i--){
                System.out.println("child Thread: " + i );
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
