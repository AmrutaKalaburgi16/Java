class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist {

    Node Head=null;

    public void add(int data){
        Node newNode=new Node(data);
        if (Head==null)
            Head=newNode;
        else {
            Node current=Head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void display(){
        Node current=Head;
        while (current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
      if(Head==null)
          Head=newNode;
      else{
            newNode.next=Head;
            Head=newNode;
      }
    }
    public void deleteFirst(){
        if(Head==null)
            System.out.println("List is empty");
        else{
            Head=Head.next;
        }
    }
    public void delete(int data){
        if(Head==null)
            System.out.println("List is empty");
        else{
            if(Head.data==data){
                Head=Head.next;
            }else{
                Node current=Head;
                while (current.next!=null && current.next.data!=data){
                    current=current.next;
                }
                if(current.next!=null){
                    current.next=current.next.next;
                }else{
                    System.out.println("Element not found");
                }
            }
        }
    }
}
