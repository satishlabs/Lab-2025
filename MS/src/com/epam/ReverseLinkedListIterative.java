package com.epam;

public class ReverseLinkedListIterative {
    Node head;
    static void main() {
        ReverseLinkedListIterative list = new ReverseLinkedListIterative();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        System.out.println("Original List:");
        list.display();
        list.head = list.reverseList();
        System.out.println("\nReversed Iteratively:");
        list.display();

        list.head = list.reverseRecursively(list.head);
        System.out.println("\nReversed Recursively:");
        list.display();

    }

    private Node reverseRecursively(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse all except first node
        Node newHead = reverseRecursively(head.next);

        // Place head at the end
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    private Node reverseList() {
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
