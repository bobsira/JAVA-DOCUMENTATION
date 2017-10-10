package chp30;

import java.util.regex.Pattern;

public class RegExpr3 {
    /**
     * Use split()
     */
    public static void main(String[] args) {
        // Match lowercase words.
        Pattern pattern = Pattern.compile("[ ,.!]");
        String[] strings = pattern.split("one two,alpha9 12!done.");
        for (int i = 0 ; i < strings.length ; i++ )
            System.out.println("Next token: " + strings[i] );
    }
}
