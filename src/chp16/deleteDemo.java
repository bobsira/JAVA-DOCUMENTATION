package chp16;

/**
 * Created by bobsira on 7/13/17.
 * Demonstrate delete() and deleteCharAt()
 */
public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a test.");
        stringBuffer.delete(4, 7);
        System.out.println("After delete: " + stringBuffer);

        stringBuffer.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + stringBuffer);
    }
}
