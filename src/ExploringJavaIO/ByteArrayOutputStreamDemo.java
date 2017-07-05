package ExploringJavaIO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by bobsira on 6/9/17.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException{

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        String string="This should end up in the array";
        byte buf[]=string.getBytes();

        byteArrayOutputStream.write(buf);
        System.out.println("Buffer as a string");
        System.out.println(byteArrayOutputStream.toString());

        System.out.println("Into array");
        byte b[]=byteArrayOutputStream.toByteArray();
        for (int i=0;i<b.length;i++){
            System.out.print((char)b[i]);
        }
        System.out.println("\nTo an OutputStream()");
        OutputStream fileOutputStream=new FileOutputStream("test.txt");
        byteArrayOutputStream.writeTo(fileOutputStream);
        fileOutputStream.close();

        System.out.println("Doing a reset");
        byteArrayOutputStream.reset();
        for (int i=0;i<3;i++)
            byteArrayOutputStream.write('X');
        System.out.println(byteArrayOutputStream.toString());
    }
}
