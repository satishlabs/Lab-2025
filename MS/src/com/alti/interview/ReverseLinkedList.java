package com.alti.interview;

public class ReverseLinkedList {
    static Node head;
    static void main(String[] args) {
    ReverseLinkedList list = new ReverseLinkedList();
    list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        System.out.println("\n===================");
        list.reverse();
        list.display();
    }

    private void reverse() {
        Node curr = head;
        Node prev = null;
        Node nextNode = null;
        while (curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    private void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        while(head == null){
           head = newNode;
           return;
        }
       Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

    }
}
