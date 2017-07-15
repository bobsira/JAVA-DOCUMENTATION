package chp18;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by bobsira on 7/15/17.
 * HashSet creates a collection that
 * uses a hash table for storage.
 *
 * LinkedHashSet maintains a linked list of the entries in the set, in the order in which
 * they were inserted.
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


        // Create a linked hash set
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();



        // Add elements to the hash Set.
        linkedHashSet.add("Beta");
        linkedHashSet.add("Alpha");
        linkedHashSet.add("Eta");
        linkedHashSet.add("Gamma");
        linkedHashSet.add("Epsilon");
        linkedHashSet.add("Omega");

        System.out.println(linkedHashSet);
    }
}
