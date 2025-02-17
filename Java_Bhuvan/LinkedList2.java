package LinkedList;

/*
// Defined Node class Already

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

*/

class Rev {
    Node head;

    public void addFirst(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
        } else {
            n1.next = head;
            head = n1;
        }
    }

    public void printRev() {
        Node n1 = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (n1 != null) {
            System.out.println(n1.data);
            n1 = n1.next;
        }
    }
    
}

public class LinkedList2 {
    public static void main(String[] args) {
        Rev r = new Rev();
        r.addFirst(100);
        r.addFirst(200);
        r.addFirst(300);
        r.printRev();
    }
}
