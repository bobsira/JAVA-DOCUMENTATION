package chp16;

/**
 * Created by bobsira on 7/13/17.
 * Demonstrate charAt() and setCharAt()
 */
public class setCharAtDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("buffer before = " + stringBuffer);
        System.out.println("charAt(1) before = " + stringBuffer.charAt(1));

        stringBuffer.setCharAt(1, 'i');
        stringBuffer.setLength(2);
        System.out.println("buffer after =" + stringBuffer);
        System.out.println("charAt(1) after = " + stringBuffer.charAt(1));
    }
}
