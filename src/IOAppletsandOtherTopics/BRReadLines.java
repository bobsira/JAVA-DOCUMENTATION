package IOAppletsandOtherTopics;
import java.io.*;
/**
 * Created by bobsira on 6/3/17.
 * Read a string from console using a BufferedReader
 */
public class BRReadLines {
    public static void main(String[] args)
    throws IOException {
        //create a BufferedReader using System.in
        BufferedReader bufferedReader=new
                BufferedReader(new InputStreamReader(System.in));
        String string;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit");
        do {
            string=bufferedReader.readLine();
            System.out.println(string);
        } while (!string.equals("stop"));
    }
}
