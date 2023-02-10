package org.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {
    public static void main(String[] args) {
        // same as set in c++
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");

        System.out.println(treeSet);

        treeSet.remove("C");

        for(String item: treeSet) {
            System.out.print(item+" ");
        }
    }
}
