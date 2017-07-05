package IOAppletsandOtherTopics;
import java.io.*;
/**
 * Created by bobsira on 6/3/17.
 * A tiny editor
 */
public class TinyEdit {
    public static void main(String[] args)
            throws IOException {
        //create a BufferedReader using System.in
        BufferedReader bufferedReader=new
                BufferedReader(new InputStreamReader(System.in));

        String string[]=new String[100];
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");

        for (int i=0;i<100;i++){
            string[i]=bufferedReader.readLine();
            if (string[i].equals("stop")) break;
        }
        System.out.println("\nHere is your file:");

        //display the lines
        for (int i=0;i<100;i++){
            if (string[i].equals("stop")) break;
            System.out.println(string[i]);
        }
    }
}
