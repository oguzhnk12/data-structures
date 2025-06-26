package org.example;

import com.sun.source.tree.Tree;
import org.example.linear.LinkedList;
import org.example.linear.Queue;
import org.example.linear.Stack;
import org.example.nonlinear.BinaryTree;

public class Main {
    public static void main(String[] args) {
        var tree = new BinaryTree(5);
        tree.insertLeft(tree.root, 41);
        tree.insertRight(tree.root, 42);
        tree.insertLeft(tree.root.left, 10);
        tree.preorder(tree.root);
    }
}