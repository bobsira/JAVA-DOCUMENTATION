package chp8;

/**
 * Created by bobsira on 7/28/17.
 * Create a subclass by extending class A
 */
public class B extends A {
    // A's j is not accessible here.
    int total;
    int k;

    B() {
        System.out.println("Inside B's constructor.");
    }

    B(int a, int b, int k) {
        super(a, b);
        this.k = k;
    }


    void showk() {
        System.out.println("k: " + k);
        //total = i + j;  // Error, j is not accessible here
    }

    // display k – this overrides show() in A
    void show() {
        super.show();  // this calls A's show()
        System.out.println("k: " + k);
    }
    void sum() {
        //System.out.println("i+j+k: " + (i + j + k)); // Error, j is not accessible here
    }
}
