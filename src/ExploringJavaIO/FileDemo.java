package ExploringJavaIO;

import java.io.File;

/**
 * Created by bobsira on 6/7/17.
 * Demonstrate File
 * File f1 = new File("/");
 * File f2 = new File("/","autoexec.bat");
 * File f3 = new File(f1,"autoexec.bat");
 */
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File file=
                new File
                        ("/home/bobsira/Documents/java/java-reference-codes/src/ExploringJavaIO");
        p("File name: "+file.getName());
        p("Path: "+file.getPath());
        p("Absolute Path: "+file.getAbsolutePath());
        p("Parent: "+file.getParent());
        p(file.exists() ? "exits" : "does not exist");
        p(file.canWrite() ? "is writable" : "is not writable");
        p(file.canRead() ? "is readable" : "is not readable");
        p(file.canExecute() ? "is executable" : "is not executable");
        p("is "+ (file.isDirectory() ? "a directory ":"not a directory"));
        p(file.isFile()? "is normal file":"might be a named piped");
        p(file.isAbsolute()? "is absolute ": "is not absolute");
        p("File last modified "+file.lastModified());
        p("File size: " + file.length() + " Bytes");
        p("Total space  of the file is "+file.getTotalSpace());
    }
}
