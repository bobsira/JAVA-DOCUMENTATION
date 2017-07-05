package PackagesInterfaces.Extending;

/**
 * Created by bobsira on 6/14/17.
 * This class must implement all of A and B
 */
public class MyClass implements B{
    @Override
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Implement meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3().");
    }
}
