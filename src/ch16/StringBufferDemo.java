package ch16;

/**
 * Created by bobsira on 7/13/17.
 * Stringbuffer length vs. capacity
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        System.out.println("buffer = " + stringBuffer);
        System.out.println("length = " + stringBuffer.length());
        System.out.println("capacity = " + stringBuffer.capacity());
    }


    /**
     * Common methods
     * void ensureCapacity(int minCapacity)
     * void setLength(int len)
     * void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)
     *
     * String substring(int startIndex)
     * String substring(int startIndex, int endIndex)
     */
}
