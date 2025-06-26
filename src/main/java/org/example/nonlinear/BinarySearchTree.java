package org.example.nonlinear;

import java.util.LinkedList;
import java.util.Queue;



public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insertRec(node.left, value);
        else if (value > node.data)
            node.right = insertRec(node.right, value);

        return node;
    }

    // Inorder (Sol - Kök - Sağ)
    public void printInorder() {
        System.out.print("Inorder: ");
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    // Preorder (Kök - Sol - Sağ)
    public void printPreorder() {
        System.out.print("Preorder: ");
        preorderRec(root);
        System.out.println();
    }

    public void preorderRec(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    // Postorder (Sol - Sağ - Kök)
    public void printPostorder() {
        System.out.print("Postorder: ");
        postorderRec(root);
        System.out.println();
    }

    public void postorderRec(Node node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Level-order (BFS)
    public void printLevelOrder() {
        System.out.print("Level-order: ");
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }
    static class  Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
}

