package revisionDsa;

public class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

//	static void printNode() {
//		Node n= head;
//		
//		while(n!=null) {
//			
//			System.out.print(n.data+" ");
//			n=n.next;
//			
//		}
//	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		head.next = new Node(2);

		ll.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

//		printNode();

		Node n = head;
		while (n != null) {
//			
			System.out.print(n.data + " ");
			n = n.next;
//			
		}

	}

}
