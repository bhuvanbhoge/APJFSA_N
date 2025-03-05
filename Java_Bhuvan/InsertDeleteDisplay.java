package LinkedList;

public class InsertDeleteDisplay {
	public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
        }
        
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    
    
    Node head;
    
    public void insertFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    
    public void insertAtLast(int data){
        if(head==null){
            insertFirst(data);
            return;
        }
        Node node=new Node(data);
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    
    public void insert(int index,int data){
        if(index==0){
            insertFirst(data);
            return;
        }
        Node node=new Node(data);
        int count=0;
        Node temp=head;
        
        while(count<index-1){
            temp=temp.next;
            count++;
        }
        node.next=temp.next;
        temp.next=node;
    }
    
    public void display(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    
    public void deleteByIndex(int index){
        if(head==null){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node temp=head;
        int count=0;
        while(count<index-1 && temp!=null){
            temp=temp.next;
            count++;
        }
        if(temp==null && temp.next==null)return;
        
        temp.next=temp.next.next;
        
    }
    
    public void deleteByData(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
    }
    
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head= head.next;
    }
    
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    
    public void deleteAll(){
        head=null;
        System.out.println("Complete LinkedList is deleted");
    }
            
    public static void main(String[] args) {
    	InsertDeleteDisplay m=new InsertDeleteDisplay();
        
        m.insertFirst(4);
        m.display();
        
        m.insertAtLast(5);
        m.display();
        
        m.insert(1,8);
        m.display();
        
        m.deleteByIndex(2);
        m.display();
        
        m.insertAtLast(6);
        m.display();
        
        m.deleteByData(8);
        m.display();
        
        m.deleteFirst();
        m.display();
        
        m.insertAtLast(9);
        m.display();
        
        m.deleteLast();
        m.display();
        
        m.deleteAll();
        m.display();
    }
}
