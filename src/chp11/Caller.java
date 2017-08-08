package chp11;

/**
 * Created by bobsira on 8/8/17.
 */
public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme target, String msg){
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
        thread.start();
    }

//    public void run(){
//        target.call(msg);
//    }

    // synchronize calls to call()
    public void run(){
        synchronized (target){ // synchronized block
            target.call(msg);
        }
    }
}
