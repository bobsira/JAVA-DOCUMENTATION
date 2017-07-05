package ExploringJavaIO;

import java.io.File;

/**
 * Created by bobsira on 6/7/17.
 * using directories
 */
public class DirList {
    public static void main(String[] args) {
     String directoryname= "/home/bobsira/Documents";
        File file=new File(directoryname);

        if (file.isDirectory()){
            System.out.println("Directory of "+ directoryname);
            String directorylist[]=file.list();

            for (int i=0;i<directorylist.length;i++){
                File file1=new File(directoryname+"/"+directorylist[i]);
                if (file1.isDirectory()){
                    System.out.println(directorylist[i]+" is a directory");
                } else {
                    System.out.println(directorylist[i]+" is a file");
                }
            }
        } else {
            System.out.println(directoryname+" is not a directory");
        }
    }
}
