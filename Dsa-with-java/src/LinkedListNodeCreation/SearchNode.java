package LinkedListNodeCreation;

public class SearchNode {
	static Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public static void main(String[] args) {

		SearchNode ll = new SearchNode();

		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		
		ll.printNode();
		ll.searchNodeData(1);
		if (ll.searchNodeData(5))
            System.out.println("Yes");
        else
            System.out.println("No");


	}

	public boolean searchNodeData(int x) {
		boolean f=false;
		Node n=head;
		while (n != null) {
            if (n.data == x)
                return true; // data found
            n = n.next;
        }
        return false; // data not found
		
	}

	public void printNode() {
		
		Node n= head;
		
		String bag="";
		while(n!=null) {
			
			bag+=n.data+" ";
			
			n=n.next;
		}
		System.out.println(bag);
		
	}

	public void push(int data) {
		
		Node node1= new Node(data);
		
		node1.next= head;
		head=node1;
		
		
	}

}
