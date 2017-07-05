package ExploringJavaIO;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by bobsira on 6/7/17.
 */
public class OnlyExt implements FilenameFilter {
    String ext;

    public  OnlyExt(String ext){
        this.ext= "." + ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
