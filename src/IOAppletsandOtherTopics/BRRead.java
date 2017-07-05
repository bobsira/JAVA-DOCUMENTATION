package IOAppletsandOtherTopics;

import java.io.*;
/**
 * Created by bobsira on 6/3/17.
 * Use a BufferedReader to read characters from the console.
 */
public class BRRead {
    public static void main(String[] args)
    throws IOException {
        char c;
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit");

        //read characters
        do {
            c=(char)bufferedReader.read();
            System.out.println(c);
        }while (c !='q');
    }
}
