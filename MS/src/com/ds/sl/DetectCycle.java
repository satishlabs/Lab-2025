package com.ds.sl;

public class DetectCycle {
    //static Node head;
    static void main() {
       // DetectCycle list = new DetectCycle();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        //create cycle
        head.next.next.next.next = head.next;

        detectCycle(head);
        System.out.println("\n================");
        detectCycle1(head);
    }

    private static void detectCycle1(Node head) {
        Node slow = head;
        Node fast = head;
        while(slow != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
               break;
           }
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("cycly start from : "+slow.data);
    }

    private static void detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                System.out.println("Loop detected");
                return;
            }
        }
        System.out.println("No Loop!");
    }
}
