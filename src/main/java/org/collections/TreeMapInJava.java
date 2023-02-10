package org.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInJava {
    public static void main(String[] args) {
        // same as map in c++
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "B");
        treeMap.put(4, "C");
        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");
        treeMap.put(35, "B");
        treeMap.put(1, "C");

        System.out.println(treeMap);

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        treeMap.remove(3);
        System.out.println(treeMap);

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
    }
}
