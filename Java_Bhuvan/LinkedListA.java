package LinkedList;

class Test{
	private Node head;
	private Node tail;
	private int size;
	public Test() {
		this.size = 0;
	}
	
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next =head;
		head = node;
		
		if(tail==null) {
			tail = head;
		}
		size++;	
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + " ->  ");
			temp = temp.next;
		}
		System.out.println("End");
	}




	private class Node{
		
		private int val;
		private Node next;
		
		public Node(int val) {
			super();
			this.val = val;
		}
		
		public Node(int val, Node next) {
			super();
			this.val = val;
			this.next = next;
		}
		
	}
}


public class LinkedListA {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.insertFirst(3);
		t.insertFirst(5);
		t.insertFirst(7);
		t.insertFirst(9);
		t.display();
	}
	
}

