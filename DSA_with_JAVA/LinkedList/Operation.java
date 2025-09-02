 public class Operation{
     static class Node{
          int data;
         Node next;
        Node(int data){
          this.data=data;
          this.next=null;
        }  
      }
 
  public static Node head;
  public static Node tail;

 public void addFirst( int data){
    Node n1=new Node(data);
    if(head==null){
      head=tail=n1;
      return;
    }
    n1.next=head;
    head=n1;
 }
 public void printlist(){
   Node temp=head;
    if(temp==null){
      return;
   }
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp =temp.next;
  }
    System.out.println("null");
 }
 public int helper(Node head,int key,int i){
  if(head==null){
    return -1;
  }
  if(head.data==key){
    return i;
  }
//  int idx =helper(head.next,key);
//  if(idx==-1){
//   return -1;
//  }
//  return idx+1;
   int idx =helper(head.next,key,i+1);
   return idx;
 }
 public int searchKey(int key ){
  return helper(head,key,0);
 }
 public void reverse(){
   Node prev = null;
   Node curr =head;
   Node next;
   while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
   }
   head=prev;
 }
 public void deleteNthfromEnd(int n){
  Node temp=head;
  int sz=0;
  while(temp!=null){
    temp=temp.next;
    sz++;
  }
  // if(n==sz){
  //   head=head.next;
  //   return;
  // }
  int i=1;
  Node prev=head;
  while(i<sz-n){
   prev=prev.next;
    i++;
  }
 prev.next=prev.next.next;
 return;
}
/////sloe fast concept  
public Node findMid(Node head){
  Node slow=head;
  Node fast=head;
  while(fast!=null&&fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
  }
  return slow;
}
public boolean checkPalindrom(){
  if(head==null||head.next==null){
     return true;
  }

  // step1 : find mid
  Node mymid=findMid(head);

 // step2 : reverse the 2nd half
 Node prev=null;
 Node curr=mymid;
 Node next;
 while (curr!=null) {
  next=curr.next;
  curr.next=prev;
  prev=curr;
  curr=next;
  }
  Node right=prev;
  Node left=head;

  // step3 : 1st and 2nd half to compare
  while(right!=null){
    if(left.data!=right.data){
      return false;
    }
    left=left.next;
    right=right.next;
  }
  return true;
}
    public static void main(String args[]){
       Operation obj =new Operation();
       obj.printlist();
      //  obj.addFirst(3);
       obj.addFirst(1);
       obj.addFirst(2);
       obj.addFirst(2);
       obj.addFirst(1);
       obj.printlist();
      System.out.println( "index is :"+obj.searchKey(3));
      System.out.println( "index is :"+obj.searchKey(5));
      // obj.reverse();
      // obj.printlist();
      // obj.deleteNthfromEnd(3);
      // obj.printlist();
      System.out.println(obj.checkPalindrom());

       
      }
}
