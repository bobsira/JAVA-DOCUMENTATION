package chp16;

/**
 * Created by bobsira on 7/13/17.
 * Demonstrate insert().
 */
public class insertDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("I Java!");

        stringBuffer.insert(2, "like ");
        System.out.println(stringBuffer);
    }
}
