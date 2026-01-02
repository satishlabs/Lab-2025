package com.alti.ll;

public class DetectTheLoop {
    static Node head;
    static void main() {
        DetectTheLoop list = new DetectTheLoop();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.head.next.next.next = list.head;

       // list.display();

        System.out.println(list.detectLoop());

    }

    private boolean detectLoop() {
        Node fastNode = head;
        Node slowNode = head;

        while(fastNode != null && slowNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode){
                System.out.println("Loop Detected!!");
                return true;
            }
        }
        return false;
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
