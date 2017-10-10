package chp30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr0 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("W+");
        Matcher matcher = pattern.matcher("W WW WW");
        while (matcher.find())
            System.out.println("Match: " + matcher.group());
    }
}
