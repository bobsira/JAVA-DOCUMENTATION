package chp30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr0 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("W+");
        Matcher matcher = pattern.matcher("W WW WW");
        while (matcher.find())
            System.out.println("Match: " + matcher.group());

        System.out.println();
        /**
         * Use wildcard and quantifier
         */
        Pattern pattern1 = Pattern.compile("e.+d");
        Matcher matcher1 = pattern1.matcher("extend cup end table");
        while (matcher1.find())
            System.out.println("Match: " + matcher1.group());
        /**
         * output
         * Match: extend cup end
         *
         * The reason that the longer sequence is found is that, by default, fnd() matches the longest sequence that fits
         * the pattern. This is called greedy behavior.
         *
         * You can specify reluctant behavior by adding the ? quantifier to the pattern
         */

        /**
         * Use the ? quantifier
         */
        System.out.println();
        // use reluctant matching behavior.
        Pattern pattern2 = Pattern.compile("e.+?d");
        Matcher matcher2 = pattern2.matcher("extend cup end table");
        while (matcher2.find())
            System.out.println("Match: " + matcher2.group());
    }
}
