package chp14;

/**
 * Created by bobsira on 7/5/17.
 * Demonstrate TwoGen
 */
public class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer,String> tgObj=
                new TwoGen<Integer,String>(88,"Generics");

        //show the types.
        tgObj.showTypes();

        //Obtain and show values.
        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
