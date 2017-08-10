package chp11;

/**
 * Created by bobsira on 8/10/17.
 */
public class A {
    synchronized void foo( B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("A Interrupted");
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("Inside A.last");
    }
}
