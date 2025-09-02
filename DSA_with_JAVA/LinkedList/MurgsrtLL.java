import java.util.*;
public class MurgsrtLL{
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            }
        }
    public  Node head;
    public  Node tail;
    public  void printll(){
        Node temp= head;
        if(head==null){
            return;
        }
        while(temp!=null){
          System.out.print(temp.data+"  ");
          temp=temp.next;
        }
    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
       
    }
    public Node murge( Node head1,Node head2){
        Node tempLL =new Node(-1);
        Node temp=tempLL;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
             }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
          }
          while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
          }
          while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
          }
          return tempLL.next;

    }
    public Node murgSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        ///mid
       Node mid= getMid(head);
        // divide
        Node righthead;
        righthead= mid.next;
        mid.next=null;
       Node newleft = murgSort(head);
       Node newright =murgSort(righthead);
         // combine
         return murge(newleft,newright);
    }
      
     public static void main (String args[]){
       MurgsrtLL obj = new MurgsrtLL();
       obj.head=new Node(3);
       obj.head.next=new Node(1);
       obj.head.next.next=new Node(4);
       obj.head.next.next.next=new Node(5);
       obj.head.next.next.next.next=new Node(2);
       obj.printll();
      obj.murgSort(obj.head);
       obj.printll();
    }
}
