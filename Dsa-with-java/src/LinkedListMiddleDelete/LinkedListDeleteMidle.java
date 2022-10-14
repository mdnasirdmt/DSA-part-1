package LinkedListMiddleDelete;


public class LinkedListDeleteMidle {

	// first create node

	static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

//		LinkedListDeleteMidle lldm= new LinkedListDeleteMidle();

		LinkedListDeleteMidle.head = new Node(0);

		Node secound = new Node(1);
		Node third = new Node(2);

		Node fourth = new Node(3);
		Node fifth = new Node(4);
		head.next = secound;
		secound.next = third;
		third.next = fourth;
		fourth.next = fifth;
		Node n = head;

		printNode(n);

		deleteMiddleNode(n);

	}

	
	/// to delte node
	private static void deleteMiddleNode(Node node) {
		// first finding length of Linkedlist
		Node cur = head;
		int n = 0;
		while (cur != null) {

			n++;
			cur = cur.next;
		}
		System.out.println("linkeList length before deletion " + n);

		if (n == 1) {
			System.out.println("null");
			;
		}

		// finding middle of list
		int mid = n / 2 - 1;
		cur = head;
		int i = 0;
		while (i < mid) {
			cur = cur.next;
			i++;
		}

		cur.next = cur.next.next;

		System.out.println("linked list after deletion ");

		printNode(head);

	}

	
	// to print nodes
	private static void printNode(Node n) {
		String bag = "";
		while (n != null) {

			bag += n.data + " ";
			n = n.next;

		}
		System.out.println("list Node " + bag);
	}

}
