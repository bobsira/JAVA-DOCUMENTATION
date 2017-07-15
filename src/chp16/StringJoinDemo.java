package chp16;

/**
 * Created by bobsira on 7/13/17.
 * Demonstrate the join() method defined by String.
 */
public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569", "E-mail:John@HerbSchildt.com");
        System.out.println(result);

        String strings[] = {"Bob", "is", "the", "best", "programmer"};
        result = String.join(" -> ", strings);
        System.out.println(result);

        String name = "Bob Sira Sira";
        int first = name.codePointAt(0);
//        System.out.println(first);
//        System.out.println("o".codePointAt(0));
//        System.out.println(codePointFunction("Bob"));
        String names[] = name.split(" ");
        System.out.println(names[1]);
    }

    /**
     * code point function extraction
     * here we go
     */
    private static String codePointFunction(String name) {
        int codePointValue;
        String names = "";
        for (int i = 0; i < name.length(); i++) {
            codePointValue = name.codePointAt(i);
            names = codePointValue + "";
            names += codePointValue;
        }
        return names;
    }
}
