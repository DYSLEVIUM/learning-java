package org.collections;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
//        Deque<String> list = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");

        System.out.println(list);

        for(int i = 0; i < list.size();++i) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println('\n');

        list.remove(3);
        list.remove("E");
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
