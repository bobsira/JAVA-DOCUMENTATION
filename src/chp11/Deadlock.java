package chp11;

/**
 * Created by bobsira on 8/10/17.
 */
public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("MainThread");
        Thread thread = new Thread(this,"RacingThread");
        thread.start();

        a.foo(b);  // get lock on a in this thread
        System.out.println("Back in main thread");
    }

    public void run(){
        b.bar(a);  // get lock on b in other thread
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
