package chp11;

/**
 * Created by bobsira on 8/10/17.
 */
public class Consumer implements Runnable {
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this,"Consumer").start();
    }

    public void run(){
        while (true){
            q.get();
        }
    }
}
