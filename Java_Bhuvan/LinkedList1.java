package LinkedList;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

class Operation{
	Node head;
	Node tail;
	public void add(int i) {
		Node n1 = new Node(i);
		if(head==null) {
			head=n1;
			tail=n1;
		}else {
			tail.next=n1;
			tail = n1;
		}
	}
	
	public void print() {
		Node n1;
		n1 = head;
		if(head == null && tail == null) {
			System.out.println("List is empty");
		}
		while(n1!=null) {
			System.out.println(n1.data);
			n1=n1.next;
		}
	}
}


public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o = new Operation();
		o.add(100);
		o.add(200);
		o.add(300);
		
		o.print();

	}

}
