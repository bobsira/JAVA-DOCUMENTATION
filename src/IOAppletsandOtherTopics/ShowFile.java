package IOAppletsandOtherTopics;

import java.io.*;

/**
 * Created by bobsira on 6/3/17.
 * <p>
 * Display a text file.
 * <p>
 * To use this program, specify the name
 * of the file that you want to see.
 * For example, to see a file called TEST.txt,
 * use the following command line.
 * <p>
 * java ShowFile TEST.txt
 */
public class ShowFile {
    public static void main(String[] args)
            throws IOException {
        int i;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: ShowFile File");
            return;
        }
        // read characters until End Of File is encountered
        do {
            i = fileInputStream.read();
            if (i != -1) System.out.println((char) i);
        } while (i != -1);
        fileInputStream.close();
    }
}
