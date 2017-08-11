package chp11;

/**
 * Created by bobsira on 8/12/17.
 * Suspending and resuming a thread the modern way.
 */
public class NewThread4 implements Runnable{
    String name;  // name of thread
    Thread thread;
    boolean suspendFlag;

    NewThread4(String name){
        this.name=name;
        thread=new Thread(this,name);
        System.out.println("New thread: " + thread);
        suspendFlag = false;
        thread.start();  // start the thread
    }

    // This is the entry point for the thread.
    public void run(){
        try {
            for ( int i =5; i > 0; i --){
                System.out.println( name + ": " + i );
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e){
            System.out.println( name + " interrupted");
        }
        System.out.println( name + " exiting.");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
