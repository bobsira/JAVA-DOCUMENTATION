package chp6;

/**
 * Created by bobsira on 6/1/17.
 *
 */
// This program includes a method inside the box class.
public class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // A redundant use of this.
//    Box(double w, double h, double d) {
//        this.width = w;
//        this.height = h;
//        this.depth = d;
//    }

    // Use this to resolve name-space collisions.
//    Box(double width, double height, double depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

//    display volume of a box
//    public void volume(){
//        System.out.print("Volume is ");
//        System.out.println(width*height*depth);
//    }
    // compute and return volume
    public double volume() {
        return width * height * depth;
    }

    //sets dimensions of box
    void setDim(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
}
