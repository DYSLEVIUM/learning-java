package org.collections;

import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.push(4);
        stack.add(3);
        stack.push(32424);
        stack.push(151);
        stack.add(15);
        stack.add(151);

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        for (Integer item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("At top: " + stack.peek());

        Integer popedElement = stack.pop();
        System.out.println("poppedElement: " + popedElement);

        System.out.println(stack);
    }
}
