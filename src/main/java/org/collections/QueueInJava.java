package org.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        // Queue is an interface
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(14);
        queue.add(4);
        queue.add(51);
        queue.add(251);

        System.out.println(queue); // this is not the natural order, as under the hood, the toString() of the abstract collection class' is called which does not understand ordering

        queue.remove(); // removes the head

        for (Integer item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("At head: " + queue.peek());

        Integer popedElement = queue.poll();
        System.out.println("head removed: " + popedElement);

        System.out.println(queue);
    }
}
