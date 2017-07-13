package ch16;

/**
 * Created by bobsira on 7/13/17.
 * Demonstrate replace()
 */
public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Tiffany Teteyan Orangi");
        stringBuffer.replace(8, 15, "sira");

        System.out.println("After replace " + stringBuffer);
    }
}
