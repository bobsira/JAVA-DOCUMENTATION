package chp7;

/**
 * Created by bobsira on 7/27/17.
 */
class Outer {
    int outer_x = 100;

    void show() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    void showy() {
        //System.out.println(y);  // error, y not known here!
    }

    // this is an inner class
    class Inner {
        int y = 10; // y is local to Inner

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
