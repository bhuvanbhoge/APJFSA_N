package LinkedList;

class Dev{
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
    
    
	public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }
    
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if(head.next==null) {
        	head = null;
        	return;
        }
        
        Node curr = head;
        Node temp = head.next;
        while(temp.next!=null) {
        	temp = temp.next;
        	curr = curr.next;
        }
        curr.next=null;
    }

}

public class LinkedList3 {
	public static void main(String[] args) {
		Dev d = new Dev();
		d.add(100);
		d.add(200);
		d.add(300);
		d.print();
		System.out.println("------------");
        d.deleteFirst();
        d.print();
        System.out.println("------------");
        d.deleteLast();
        d.print();
	}
}
