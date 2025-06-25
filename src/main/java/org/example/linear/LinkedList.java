package org.example.linear;

public class LinkedList {

    public Node head;

    public static class Node {

        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node current = list.head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void deleteNode(LinkedList list, int data){

        if (list.head == null) {return;}

        if(list.head.data == data){
            Node temp = list.head.next;
            list.head = list.head.next;
            temp.next = null;
            return;
        }
        Node current = list.head;
        while (current.next != null) {
            if (current.next.data == data){
                Node temp = current.next;
                current.next = current.next.next;
                temp.next = null;
            }
            current = current.next;
        }
    }
}
