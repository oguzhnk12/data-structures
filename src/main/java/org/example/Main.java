package org.example;

import com.sun.source.tree.Tree;
import org.example.linear.LinkedList;
import org.example.linear.Queue;
import org.example.linear.Stack;
import org.example.nonlinear.BinarySearchTree;
import org.example.nonlinear.BinaryTree;

public class Main {
    public static void main(String[] args) {

            BinarySearchTree bst = new BinarySearchTree();

            int[] values = {50, 30, 70, 20, 40, 60, 80};
            for (int val : values) {
                bst.insert(val);
            }

            bst.printInorder();      // 20 30 40 50 60 70 80
            bst.printPreorder();     // 50 30 20 40 70 60 80
            bst.printPostorder();    // 20 40 30 60 80 70 50
            bst.printLevelOrder();   // 50 30 70 20 40 60 80

    }
}