package chp30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    /**
     * Use replaceAll().
     */
    public static void main(String[] args) {
        String string = "Jon Jonathan Frank Ken Todd";

        Pattern pattern = Pattern.compile("Jon.*? ");
        Matcher matcher = pattern.matcher(string);
        System.out.println("Original sequence: " + string);
        string = matcher.replaceAll("Eric ");
        System.out.println("Modified sequence: " + string);
    }
}
