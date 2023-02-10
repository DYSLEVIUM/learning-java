package org.collections;

import java.util.AbstractMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInJava {
    public static void main(String[] args) {
        // same as unordered_map in c++
//        AbstractMap<String, Integer> hashmap = new HashMap<>();
        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put("a", 14);
        hashmap.put("b", 4);
        hashmap.put("c", 214);

        System.out.println(hashmap);

        if(hashmap.containsKey("a")) {
            Integer a = hashmap.get("a");
            System.out.println("Value for a: " + a);
        }

        for(String key: hashmap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println('\n');

        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());

        for(Entry<String, Integer> entry:hashmap.entrySet()) {
            System.out.println("Key " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
