package com.globallogic;

public class ReverseLinkedList {
    static Node head;
    static void main() {
        ReverseLinkedList list = new ReverseLinkedList();
        for(int i=5; i>0; i--){
            list.insert(i);
        }
        list.display();
        head = list.reserseLinkedList();
        System.out.println("\n After reverse LinkedList: ");
        list.display();
    }

    private Node reserseLinkedList() {
        Node curr = head;
        Node prev = null;
        Node nextNode = null;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}
