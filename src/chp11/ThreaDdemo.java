package chp11;

/**
 * Created by bobsira on 8/4/17.
 */
public class ThreaDdemo {
    public static void main(String[] args) {
        new Newthread(); // create a new thread

        try {
            for (int i =5; i > 0; i --){
                System.out.println("Main Thread: " + i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e ){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }
}
