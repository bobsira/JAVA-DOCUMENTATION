package chp18;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by bobsira on 7/20/17.
 */
public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Integer> navigableMap
                = new TreeMap<String, Integer>();

        navigableMap.put("C", 888);
        navigableMap.put("Y", 999);
        navigableMap.put("A", 444);
        navigableMap.put("T", 555);
        navigableMap.put("B", 666);
        navigableMap.put("A", 555);

        System.out.printf("Descending Set  : %s%n",
                navigableMap.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n",
                navigableMap.floorEntry("L"));
        System.out.printf("First Entry  : %s%n",
                navigableMap.firstEntry());
        System.out.printf("Last Key : %s%n",
                navigableMap.lastKey());
        System.out.printf("First Key : %s%n",
                navigableMap.firstKey());
        System.out.printf("Original Map : %s%n", navigableMap);
        System.out.printf("Reverse Map : %s%n",
                navigableMap.descendingMap());
    }
}
