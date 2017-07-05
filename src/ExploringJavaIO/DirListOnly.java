package ExploringJavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

/**
 * Created by bobsira on 6/7/17.
 * Directory of .pdf files
 */
public class DirListOnly {
    public static void main(String[] args)  {
        String directoryname="/home/bobsira/Document";
        File file=new File(directoryname);
        FilenameFilter only=new OnlyExt("com");
        String directorylist[]=file.list(only);

        for (int i=0;i<directorylist.length;i++){
            System.out.println(directorylist[i]);
        }
    }
}
