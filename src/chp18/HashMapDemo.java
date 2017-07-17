package chp18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by bobsira on 7/17/17.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        // put elements in the map
        hashMap.put("John Doe", new Double(3434.34));
        hashMap.put("Tom Smith", new Double(123.22));
        hashMap.put("Jane Baker", new Double(1378.00));
        hashMap.put("Tod Hall", new Double(99.22));
        hashMap.put("Ralph Smith", new Double(-19.08));

        // Get a set of the entries.
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        // Display the set.
        for (Map.Entry<String, Double> me : set
                ) {
            System.out.print(me.getKey() + " ");
            System.out.print(me.getValue());
            System.out.println();
        }
        System.out.println();

        // Deposit 1000 into John Doe's account
        double balance = hashMap.get("John Doe");
        hashMap.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + hashMap.get("John Doe"));
    }
}
