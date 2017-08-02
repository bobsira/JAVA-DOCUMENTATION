package chp10;

/**
 * Created by bobsira on 8/3/17.
 * This program creates a custom exception type
 */
public class MyException extends Exception{
    private int details;

    MyException(int details){
        this.details = details;
    }

    @Override
    public String toString() {
        return "MyException[" + details + "]";
    }
}
