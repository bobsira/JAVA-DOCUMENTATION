package chp14;

/**
 * Created by bobsira on 7/7/17.
 */
public class GenConsDemo {
    public static void main(String[] args) {
        GenCons genCons = new GenCons(100);
        GenCons genCons1 = new GenCons(123.5F);

        genCons.showVal();
        genCons1.showVal();
    }
}
