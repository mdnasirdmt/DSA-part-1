package LinkedListNodeCreation;

import java.util.Arrays;

public class LinkedList1 {

	static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static void printNode(Node n) {
		String bag = "";
		while (n != null) {
//			System.out.println(n.data+" ");
			bag += n.data + " ";
			n = n.next;
		}
		System.out.println(bag);

	}

	public static void main(String[] args) {

		LinkedList1 list = new LinkedList1();

		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		list.head.next = second;
		second.next = third;

		Node n = head;
		printNode(n);

	}

}

/*
 * 
 * Representation of Linked Lists: A linked list is represented by a pointer to
 * the first node of the linked list. The first node is called the head of the
 * linked list. If the linked list is empty, then the value of the head points
 * to NULL.
 * 
 * Each node in a list consists of at least two parts:
 * 
 * A Data Item (we can store integer, strings, or any type of data). Pointer (Or
 * Reference) to the next node (connects one node to another) or An address of
 * another node In C, we can represent a node using structures. Below is an
 * example of a linked list node with integer data. In Java or C#, LinkedList
 * can be represented as a class and a Node as a separate class. The LinkedList
 * class contains a reference of Node class type.
 */
