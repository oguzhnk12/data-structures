package org.example.linear;


import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private int[] stack;

    public Stack() {
        stack = new int[0];
    }

    public void push(int value) {
        stack = Arrays.copyOf(stack, stack.length + 1);
        stack[stack.length - 1] = value;
    }
    public int pop() {
        if (stack.length == 0) {
            throw new EmptyStackException();
        }
        var value = stack[stack.length - 1];
        stack = Arrays.copyOf(stack, stack.length - 1);
        return value;
    }
    public void print() {
        System.out.println(Arrays.toString(stack));
    }
    public int peek() {
        if (stack.length == 0) {
            throw new EmptyStackException();
        }
        return stack[stack.length - 1];
    }
}
