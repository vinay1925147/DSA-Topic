import java.util.*;
public class DoubleLL {
  static  class Node{
   
      int data;
      Node next;
      Node prev=null;
       Node(int data){
       this.data=data;
       this.next=null;
       this.prev=null;
      //  System.out.print(this.data+" ");
       }
      
   }
   public static Node head;
   public static Node tail;
   public static int size;
   public  void addFirst(int data){
      Node newnode =new Node(data);
      if(head==null){
         head=newnode;
         return;
       }
      newnode.next=head;
      head.prev=newnode;
      head=newnode;
   }
   public void addLast(int data){
      Node newnode = new Node(data);
      if(head==null){
         head=tail=newnode;
         return;
      }
      tail.next=newnode;
      newnode.prev=tail;
      tail=newnode;
   }
   public int removeFirst(){
      if(head==null){
         System.out.println("list is empty");
         return Integer.MAX_VALUE;
      }
      if(size==1){
         int val= head.data;
         head=tail=null;
         return val;
      }

      int val=head.data;
      head=head.next;
      head.prev=null;
      return val;
   }
   public int removeLast(){
      if(head==null){
         System.out.println("list is empty");
         return Integer.MIN_VALUE;
      }
      if(size==1){
         int val = tail.data;
         head=tail=null;
         return val;
       }
       int val=tail.data;
       tail=tail.prev;
       tail.next=null;
       return val;
       }
   public void reverseDLL(){
         Node curr=head;
         Node prev=null;
         Node next;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            // curr.prev=next;
            prev=curr;
            curr=next;
          }
          prev=head;
      }
   public  static boolean detactCycle(){
     Node slow = head;
     Node fast= head;
    while(fast!=null && fast.next!=null){
       slow = slow.next;
       fast= fast.next.next;
       if(slow==fast){
         return true;
       }
    }
    return false;

   }
   public static void remeveCycleLL(){
      // find last node
      Node slow=head;
      Node fast=head;
      boolean cycle = false;
     while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
         cycle = true;
         break;
      }
     }
     if(cycle==false){
      return ;
     }
     // meet slow and fast at a point
     slow = head;
     Node prev = null;
     while(slow!=fast){
       prev=fast;
       slow=slow.next;
       fast=fast.next;
       }
       prev.next=null; 
      // lastnode.next = null
   }
   public void printlist(){
      if(head==null){
         System.out.println("list is empty");
         return;
      }
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+"->");
         temp=temp.next;
      }
      System.out.println("null");
      return;
   }
   public static void main(String args []){
     DoubleLL obj =new DoubleLL();
   //   obj.addFirst(5);
   //   obj.addFirst(4);
   //   obj.addFirst(3);
   //   obj.addFirst(2);
   //   obj.addFirst(1);
   obj.addLast(1);
   obj.addLast(2);
   obj.addLast(3);
   obj.addLast(4);
   obj.addLast(5);
   obj.printlist();
   // // obj.removeFirst();
   // obj.removeLast();
   // obj.printlist();
   obj.reverseDLL();
   obj.printlist();
    

  











   //   head= new Node(1);
   //   head.next=new Node(2);
   //   head.next.next=new Node(3);
   //   head.next.next.next=new Node(4);
   //   head.next.next.next.next=new Node(5);
   //   head.next.next.next.next.next=head.next.next;
   //  System.out.println(detactCycle());
   //  remeveCycleLL();
   //  System.out.println(detactCycle());
    


   }
   }
    
