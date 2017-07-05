package ExploringJavaIO;

import java.io.ByteArrayInputStream;

/**
 * Created by bobsira on 6/9/17.
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp="abcdefghijklmnopqrstuvwxyz";
        byte b[]=tmp.getBytes();
        ByteArrayInputStream byteArrayInputStream1=new ByteArrayInputStream(b);
        ByteArrayInputStream byteArrayInputStream2=new ByteArrayInputStream(b,0,3);

        //The input1 object contains the entire lowercase alphabet, while input2 contains only the
        //first three letters.
    }
}
