package chp11;

/**
 * Created by bobsira on 8/7/17.
 * Creating multiple threads
 */
public class NewThread2 implements Runnable{
    String threadname; // name of thread
    Thread thread;

    NewThread2(String threadname){
        this.threadname = threadname;
        thread = new Thread(this,threadname);
        System.out.println("New thread: " + threadname );
        thread.start(); // start the thread
    }

    // This is the entry point for thread
    public void run(){
        try {
            for ( int i = 5; i > 0; i--){
                System.out.println(threadname + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e ){
            System.out.println( threadname + "Interrupted");
        }
        System.out.println( threadname + " exiting");
    }
}
