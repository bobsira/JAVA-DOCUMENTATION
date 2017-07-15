package chp18;

import java.util.HashSet;

/**
 * Created by bobsira on 7/15/17.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // Create a hash set
        HashSet<String> hashSet = new HashSet<String>();
        
        // Add elements to the hash Set.
        hashSet.add("Beta");
        hashSet.add("Alpha");
        hashSet.add("Eta");
        hashSet.add("Gamma");
        hashSet.add("Epsilon");
        hashSet.add("Omega");

        System.out.println(hashSet);
    }
}
