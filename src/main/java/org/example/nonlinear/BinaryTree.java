package org.example.nonlinear;

public class BinaryTree {
    public Node root;
    public BinaryTree(int value) {
        this.root = new Node(value);
    }
    public void insertLeft(Node root,int value) {
        if (root == null) {
            return;
        }
        root.left = new Node(value);

    }
    public void insertRight(Node root, int value) {
        if (root == null) {
            return;
        }
        root.right = new Node(value);
    }
    public static class Node{
        public int value;
        public Node left, right;
        public Node(int value){}
    }
    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }
}
