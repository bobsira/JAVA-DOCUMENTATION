package chp9.p1;

/**
 * Created by bobsira on 6/12/17.
 */
class Derived extends Protection {
    Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);

        //class only
        //System.out.println("n_pri ="4 + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
