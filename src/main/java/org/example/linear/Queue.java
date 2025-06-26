package org.example.linear;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
    private int[] queue;

    public Queue() {
        this.queue = new int[0];

    }
    public void enqueue(int value) {
        queue = Arrays.copyOf(queue, queue.length + 1);
        queue[queue.length - 1] = value;
    }
    public int dequeue() {
        var value = queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length);
        return value;
    }
    public void print() {
        System.out.println(Arrays.toString(queue));
    }
}
