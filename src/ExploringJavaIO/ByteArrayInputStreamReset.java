package ExploringJavaIO;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by bobsira on 6/9/17.
 */
public class ByteArrayInputStreamReset {
    public static void main(String[] args) throws IOException{

        String tmp="abc";
        byte b[]=tmp.getBytes();
        ByteArrayInputStream byteArrayInputStream=
                new ByteArrayInputStream(b);

        for (int i=0;i<2;i++){
            int c;
            while ((c=byteArrayInputStream.read()) != -1){
                if (i==0){
                    System.out.print((char)c);
                }else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            byteArrayInputStream.reset();
        }
    }
}
