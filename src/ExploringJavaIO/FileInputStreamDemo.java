package ExploringJavaIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * Created by bobsira on 6/7/17.
 * Demonstrate FileInputStream
 *
 * The following example creates two FileInputStreams that use the same disk file and each
 * of the two constructors:
 * FileInputStream f0 = new FileInputStream("/autoexec.bat")
 * File f = new File("/autoexec.bat");
 * FileInputStream f1 = new FileInputStream(f);
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int size;
        InputStream file=
                new FileInputStream("/home/bobsira/Documents/java/java-reference-codes/src/ExploringJavaIO/FileInputStreamDemo.java");
        System.out.println("Total Available Bytes: "
                + (size=file.available()));
        int n = size/40;
        System.out.println("First "+ n +
                            " bytes of the file one read() at a time ");
        for (int i=0;i<n;i++){
            System.out.print((char)file.read());
        }
        System.out.println("\nStill Available: "+ file.available());
        System.out.println("Reading the next " + n +
                            " with one read(b[])");
        byte b[]=new byte[n];
        if (file.read(b) != n){
            System.err.println("couldn't read "+n+" bytes");
        }
        System.out.println(new String(b,0,n));
        System.out.println("\nStill Available: "+(size=file.available()));
        System.out.println("Skipping half of the remaining bytes with skip()");
        file.skip(size/2);
        System.out.println("\nStill Available: "+(size=file.available()));
        System.out.println("Reading "+ n/2 + " into the end of array");
        if (file.read(b,n/2,n/2) !=n/2){
            System.err.println("could not read " + n/2 + " bytes.");
        }
        System.out.println(new String(b,0,b.length));
        System.out.println("\nStill Available: "+file.available());
        file.close();
    }
}
