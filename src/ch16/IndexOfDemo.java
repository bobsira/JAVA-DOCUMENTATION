package ch16;

/**
 * Created by bobsira on 7/13/17.
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("one two one");
        int i;

        i = stringBuffer.indexOf("one");
        System.out.println("First index: " + i);

        i = stringBuffer.lastIndexOf("one");
        System.out.println("Last index: " + i);
    }
}
