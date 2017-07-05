import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bobsira on 7/3/17.
 */
public class Data {

    public static void main(String[] args) {

        String date = "950815";
        System.out.println(formatDateOfBirth(date));
    }

    public static String formatDateOfBirth(String date) {
        String str = String.valueOf(date);
        String partOne = str.substring(0, 2);
        System.out.println(partOne);
        String partTwo = str.substring(2, 4);
        System.out.println(partTwo);
        String partThree = str.substring(4, 6);
        System.out.println(partThree);
        String date_result = "19" + partOne + "-" + partTwo + "-" + partThree;
        return date_result;
    }
}

