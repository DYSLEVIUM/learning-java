package org.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class HashsetInJava {
    public static void main(String[] args) {
        // same as unordered_set in c++
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(5125);
        hashSet.add(1);
        hashSet.add(1214);
        hashSet.add(1214);
        hashSet.add(14);

        System.out.println(hashSet);

        boolean b1 = hashSet.add(214);
        boolean b2 = hashSet.add(214);

        System.out.println("" + b1 + " " + b2);

        System.out.println(hashSet);
        System.out.println(hashSet.contains(14));

        hashSet.remove(1);
        System.out.println(hashSet);

        for (Integer item : hashSet) {
            System.out.print(item + " ");
        }
    }
}
