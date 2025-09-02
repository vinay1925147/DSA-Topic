import java.util.*;
public class Problem3 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head1;
    public static Node head2;
    public static Node tail;
    
  public void printList(Node head){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public  void printUnionIntersection(Node head1, Node head2){
        Node uniNode = union(head1, head2);
        Node interNode= intesection(head1, head2);
        System.out.println("union element is:");
         printList(uniNode);
         System.out.println("intersecti element is:");
         printList(interNode);

    }
    public Node intesection(Node head1,Node head2){
        HashSet<Integer> set =new HashSet<>();
        Node result=null;
        Node p=head1;
        while(p!=null){
            set.add(p.data);
            p=p.next;
        }
        Node p1 = head2;
        while(p1!=head2){
            if(set.contains(p1.data)){
                Node newnode=new Node(p1.data);
                newnode.next=result;
                result=newnode;
            }
            p1=p1.next;
        }
        return result;
    }
    public Node union(Node head1,Node head2){
        HashSet<Integer> set = new HashSet<>(); 
        Node p=head1;
        while(p!=null){
            set.add(p.data);
            p=p.next;  
        }
        Node p1= head2;
        while(p!=null){
            set.add(p1.data);
            p1=p1.next;
        }
        Node result=null;
        Node tail=null;
        for(int i:set){
            Node newnode=new Node(i);
             if (result == null) {
                    result = newnode;
                    tail = newnode;
                }
                else {
                    tail.next = newnode;
                    tail = tail.next;
                }
            }
            return result;

    }
    public static void main(String args[]){
        Problem3 obj = new Problem3();
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);//1 2 3 3 4 5
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(5);

        // List 2: 1 -> 5 -> 6
        Node head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        obj.printUnionIntersection(head1,head2);
    }
    
}
