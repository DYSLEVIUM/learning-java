package org.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>(5); // it is best practice to initialize the concrete initialization, i.e., ArrayList with interface List<Integer> (this is a generic statement and is valid for all the collections)
//    List<Integer> arrList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            arrList.add(i);
        }

        System.out.println(arrList);

        arrList.remove(3);

        System.out.println(arrList);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        for (int n : arrList) {
            System.out.println(n + "");
        }
    }
}
