package chp18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by bobsira on 7/20/17.
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap
                = new
                TreeMap<String, Double>(new TComp());

        /**
         * put elements to the map
         */
        treeMap.put("John Doe", new Double(3434.34));
        treeMap.put("Tom Smith", new Double(123.22));
        treeMap.put("Jane Baker", new Double(1378.00));
        treeMap.put("Tod Hall", new Double(99.22));
        treeMap.put("Ralph Smith", new Double(-19.08));

        /**
         *  Get a set of the entries
         */
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        /**
         * Display the elements
         */
        for (Map.Entry<String, Double> mapEntry : set
                ) {
            System.out.print(mapEntry.getKey() + ": ");
            System.out.println(mapEntry.getValue());
        }
        System.out.println();

        /**
         * Deposit 1000 into John Doe's account
         */
        double balance = treeMap.get("John Doe");
        treeMap.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " +
                treeMap.get("John Doe"));
    }
}
