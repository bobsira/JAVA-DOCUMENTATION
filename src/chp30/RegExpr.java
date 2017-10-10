package chp30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A simple pattern matching demo
 */
public class RegExpr {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;
        boolean found;

        pattern = Pattern.compile("Java");
        matcher = pattern.matcher("Java");
        found = matcher.matches();  // checks for a match

        System.out.println("Testing Java against Java.");
        if (found)
            System.out.println("Matches");
        else
            System.out.println("No Match");

        System.out.println();

        System.out.println("Testing Java against Java 8.");
        matcher = pattern.matcher("Java 8"); // create a new matcher
        found = matcher.matches(); // check for a match
        if (found)
            System.out.println("Matches");
        else
            System.out.println("No Match");

        System.out.println();

        System.out.println("Looking for Java in Java 8.");
        matcher = pattern.matcher("Java 8");
        if (matcher.find())
            System.out.println("subsequence found");
        else
            System.out.println("No Match");
    }
}
