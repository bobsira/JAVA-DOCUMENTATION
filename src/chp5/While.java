package chp5;

/**
 * Created by bobsira on 7/22/17.
 */
public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }

        int a = 10, b = 20;
        while (a > b)
            System.out.println("This will not be displayed");
    }
}
