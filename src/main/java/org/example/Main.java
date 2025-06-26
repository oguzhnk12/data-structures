package org.example;

import org.example.linear.LinkedList;
import org.example.linear.Queue;
import org.example.linear.Stack;

public class Main {
    public static void main(String[] args) {
        var queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        var value = queue.dequeue();
        System.out.println("Deque value: " + value);
        queue.print();
    }
}