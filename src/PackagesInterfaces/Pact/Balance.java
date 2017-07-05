package PackagesInterfaces.Pact;

/**
 * Created by bobsira on 6/12/17.
 *
 */
/* Now, the Balance class, its constructor, and its
show() method are public. This means that they can
be used by non-subclass code outside their package.
*/
public class Balance {
    private String name;
    private double bal;

    public Balance(String name,double bal){
        this.name=name;
        this.bal=bal;
    }
    public void show(){
        if (bal<0)
            System.out.print("--> ");
        System.out.println(name + ": $"+bal);
    }
}
