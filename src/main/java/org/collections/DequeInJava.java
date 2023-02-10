package org.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInJava {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(115);
        deque.addLast(14);
        deque.addFirst(1510);
        deque.addFirst(124);

        System.out.println(deque);

        Integer ff = deque.pop(); // removes from first
        System.out.println(ff);
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);
    }
}
