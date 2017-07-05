package chp14;

/**
 * Created by bobsira on 7/5/17.
 * A simple generic class with two type
 * parameters: T and V.
 */
public class TwoGen<T,V> {
    T ob1;
    V ob2;

    // Pass the constructor a reference to
    // an object of type T and an object of type V
    TwoGen(T ob1,V ob2){
        this.ob1=ob1;
        this.ob2=ob2;
    }

    // Show types of T and V.
    void showTypes(){
        System.out.println("Type of T is " +
        ob1.getClass().getName());

        System.out.println("type of V is " +
        ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
