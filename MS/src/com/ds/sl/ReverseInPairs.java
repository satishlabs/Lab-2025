package com.ds.sl;



public class ReverseInPairs {

    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = new Node(6);
        printList(head);
        System.out.println("\n========================");
        pairwiseSwap(head);

        printList(head);
    }

    private static void printList(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static void pairwiseSwap(Node head) {
        Node curr = head;
        while(curr != null && curr.next != null){
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;

            curr = curr.next.next;
        }
    }
}
