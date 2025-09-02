public class CirculerLL {
  static class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
     } 
    }
public static Node head;
public static Node tail;
public void addFirst(  int data){
    Node newnode = new Node(data);
    if(head==null){
    tail= head =newnode;
    tail.next=newnode;
      return ;
    }
     newnode.next=tail.next;
     tail.next=newnode;
     head = newnode;
  
}
public  void addLast(int data){
    Node newnode = new Node(data);
    if(head==null){
        head=tail=newnode;
        tail.next=newnode;
    }
    newnode.next=tail.next;
    tail.next =newnode;
    tail = newnode;
}
public int removeFirst(){
    if(head==null){return 0;}
    if(head==tail){
        head=tail=null;
        return 1;
    }
     int val = head.data;
     head= head.next;
     tail.next = head;
     return val;    
}
public  int removeLast(){
    if(head==null){
        return 0;
    }
    if(head== tail){
        head=tail=null;

    }
    int val = tail.data;
    Node prev=head;
    while(prev.next!=tail){
        prev=prev.next;
    }
    tail= prev;
    tail.next =head;
    return val;
}
public void printlist(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    
     System.out.print(head.data+"->");
     Node temp = head.next;

     while(temp != head ){
        System.out.print(temp.data+"->");
        temp=temp.next;
     }
    //  System.out.print(temp.data);
   
}
public static void main(String args[]){
    CirculerLL obj = new CirculerLL();
    obj.addFirst(1);
    obj.addFirst(2);
    // obj.addLast(3);
    // obj.addFirst(head,4);
    // obj.addFirst(head,5);
    // obj.printlist();
    // obj.removeFirst(); obj.removeFirst();
    obj.removeLast();
    obj.printlist();
}





}
    

