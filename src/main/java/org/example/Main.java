package org.example;

import com.sun.source.tree.Tree;
import org.example.linear.LinkedList;
import org.example.linear.Queue;
import org.example.linear.Stack;
import org.example.nonlinear.BinarySearchTree;
import org.example.nonlinear.BinaryTree;
import org.example.nonlinear.MinHeap;

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        heap.insert(40);
        heap.insert(20);
        heap.insert(10);
        heap.insert(25);
        heap.insert(50);

        heap.printHeap(); // Min Heap: 10 25 20 40 50 (yapı değişebilir ama kurala uyar)

        System.out.println("Çıkarılan minimum: " + heap.extractMin());
        heap.printHeap();
    }
}