package PackagesInterfaces.p2;

import PackagesInterfaces.p1.Protection;

/**
 * Created by bobsira on 6/12/17.
 */
class Protection2 extends Protection {
    Protection2() {
        System.out.println("derived other package constructor");

        // class or package only
        //System.out.println("n = " + n);

        // class only
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
