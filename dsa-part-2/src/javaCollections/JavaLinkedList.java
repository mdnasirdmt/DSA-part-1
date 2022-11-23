package javaCollections;

public class JavaLinkedList {

	static Node head;

	static class Node {

		Integer data;
		Node next;

		public Node(Integer data) {

			this.data = data;
			this.next = null;
		}

	}
	
	static void printNode() {
		Node n= head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n= n.next;
		}
		
	}

	public static void main(String[] args) {
		
		JavaLinkedList list= new JavaLinkedList();
		list.head= new Node(1);
		Node sec= new Node(2);
		Node third= new Node(3);
		Node fourth= new Node(4);
		
		list.head.next= sec;
		sec.next=third;
		third.next=fourth;
		
		printNode();

		
		
		
	}

}
