package IOAppletsandOtherTopics;
import java.io.*;
/**
 * Created by bobsira on 6/3/17.
 * Demonstrate PrintWriter
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter=
                new PrintWriter(System.out,true);
        printWriter.println("This is a string");
        int i=-7;
        printWriter.println(i);
        double d=4.5e-7;
        printWriter.println(d);
    }
}
