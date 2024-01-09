public class LinkedListImpl{

    Node head;
    private int size;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        Node currNode=head;
        if(head==null) {
            head = newNode;
            return;
        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;
        size--;
    }

    public void getSize(){
        System.out.println("size="+size);
    }

    public void printList(){
        Node currNode=head;
        if(currNode==null){
            System.out.println("list is emptu");
            return;
        }
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }

    public static void main(String args[]){
        LinkedListImpl ll=new LinkedListImpl();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.getSize();
        ll.deleteLast();
        ll.deleteFirst();
        ll.getSize();
        ll.printList();

    }

}