package chp8;

/**
 * Created by bobsira on 7/29/17.
 */
public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figref;

        figref = rectangle;
        System.out.println("Area is " + figref.area());

        figref = triangle;
        System.out.println("Area is " + figref.area());

        figref = figure;
        System.out.println("Area is " + figref.area());
    }
}
