package com.ds.sl;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddleNode {
	private static Node head;
	public static void main(String[] args) {
		PrintMiddleNode list = new PrintMiddleNode();
		for(int i=1; i<=5; i++) {
			list.insertNode(i);
			list.print(i);
		}
		list.printMiddleNode();
		System.out.println("\n===============");
		System.out.println("MiddleNode: "+list.getMiddleTwoPass());
		
		System.out.println("\n===============");
		System.out.println("MiddleNode: "+list.getMiddleUsingList());
		
		System.out.println("\n===============");
		System.out.println("MiddleNode: "+list.getMiddleRecursive());
		
		System.out.println("\n===============");
		System.out.println("MiddleNode: "+list.getMiddleStream());
	}

	private int getMiddleStream() {
		List<Integer> dataList = new ArrayList<Integer>();
		Node temp = head;
		while(temp != null) {
			dataList.add(temp.data);
			temp = temp.next;
		}
		return dataList.stream().skip(dataList.size()/2).findFirst().orElse(-1);
	}

	private int getMiddleRecursive() {
		int count = getCount(head);
		return getMiddleNode(head, count/2).data;
	}

	private Node getMiddleNode(Node node, int i) {
		if(i == 0)
			return head;
		return getMiddleNode(node.next, i-1);
	}

	private int getCount(Node node) {
		if(node == null)
			return 0;
		return 1+ getCount(node.next);
	}

	private int getMiddleUsingList() {
		if(head == null)
			return -1;
		List<Node> list = new ArrayList<Node>();
		Node temp = head;
		while(temp != null) {
			list.add(temp);
			temp = temp.next;
		}
		return list.get(list.size()/2).data;
	}

	private int getMiddleTwoPass() {
		if(head == null)
			return -1;
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		temp = head;
		for(int i=0; i<count/2; i++) {
			temp = temp.next;
		}
		return temp.data;
		// TODO Auto-generated method stub
		
	}

	private void printMiddleNode() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Node1: "+slow.data);
		
	}

	private void print(int data) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void insertNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
}
