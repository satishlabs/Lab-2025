package com.ds.sl;

public class IntersectionLinkedList {

    static void main() {
        Node common = new Node(8);
        common.next = new Node(10);

        //List A: 1->2->8-10;
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = common;

        //List B: 3->8->10;
        Node headB = new Node(3);
        headB.next = common;

        Node result = getIntersectionNode(headA, headB);

        if(result != null)
            System.out.println("Intersection at node: "+result.data);
        else
            System.out.println("No Intersection");
    }

    private static Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null)
            return null;
        Node p1 = headA;
        Node p2 = headB;

        while(p1 != p2){
            p1 = (p1 == null) ? headB : p1.next;

            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }
}
