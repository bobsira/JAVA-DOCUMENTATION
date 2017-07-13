package ch16;

/**
 * Created by bobsira on 7/13/17.
 * Using reverse() to reverse a StringBuffer
 */
public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Bob Sira Sira");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
