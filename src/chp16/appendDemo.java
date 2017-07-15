package chp16;

/**
 * Created by bobsira on 7/13/17.
 * Demonstrate append()
 */
public class appendDemo {
    public static void main(String[] args) {
        String s;
        int a = 42;
        StringBuffer stringBuffer = new StringBuffer(40);

        s = stringBuffer.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
