package org.example;

import org.example.linear.LinkedList;
import org.example.linear.Stack;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        var value = stack.pop();
        System.out.println("Popped value:" + value);
        stack.printStack();
    }
}