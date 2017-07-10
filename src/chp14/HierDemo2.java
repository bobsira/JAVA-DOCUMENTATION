package chp14;

/**
 * Created by bobsira on 7/10/17.
 * Create a Gen object
 */
public class HierDemo2 {
    public static void main(String[] args) {

        // Create a Gen object for String.
        Gen3<String> w = new Gen3<String>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
