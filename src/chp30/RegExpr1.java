package chp30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr1 {
    public static void main(String[] args) {
        /**
         * Use a character class
         */
        // Match lowercase words.
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher("this is a test");

        while (matcher.find())
            System.out.println("Match: "+ matcher.group());
    }
}
