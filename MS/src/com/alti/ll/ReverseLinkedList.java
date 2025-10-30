package com.alti.ll;

public class ReverseLinkedList {
    Node head;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        for(int i=0; i<5; i++){
            list.insert(i);
        }
        System.out.println("Original Linked List:");
        list.print();

        list.reversedLinkedList();
        System.out.println("Reversed Linked List:");
        list.print();

    }

    private void reversedLinkedList() {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next; //store next

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    private void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        if(head == null){
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
