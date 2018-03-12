package chp7;

/**
 * Created by bobsira on 7/27/17.
 */
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}

// java chp7.CommandLine this is a test 100 -1
