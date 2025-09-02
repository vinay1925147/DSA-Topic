import java.util.*;
public class Implementation {
    // static class Node{
    //     int data;
    //     Node next ;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // static class Stack{
    //     /// implemt using Linked LIst
    //    static  Node head = null;
    //    public boolean isEmpty(){
    //      return head==null;
    //    }
    //    public void push(int data){
    //      Node newnode=new Node(data);
    //      if(isEmpty()){
    //         head=newnode;
    //         return;
    //      }
    //      newnode.next=head;
    //      head=newnode;

    //    }
    //    public int pop(){
    //     if(isEmpty() ){
    //         return -1;

    //     }
    //      int top = head.data;
    //      head=head.next;
    //      return top;
    //    }
    //    public int peek(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     return head.data;
    //    }





        //implemwnt the stack using Array list 

       /*static ArrayList <Integer> list = new ArrayList<>();
        public  boolean isEmpty(){
            return list.size()==0;
     
        }
        public void push(int data){
            list.add(data);
        }
        public void pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            // return top;
        }
        public int peek(){
            return list.get(list.size()-1);
        } */


    /////implementaion using Array
   /*  int arr[]=new int [4];
     int top=-1;
     public boolean isEmpty(){
        return arr.length==0;
    }
    public void push( int data){
        if(top==4){
            System.out.println(" overflow condition");
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("underflow condition");
        }
        int del = arr[top];
        top--;
        return del;
    }
    public int peek(){
        if(top==-1){
            System.out.println("underflow condition");
        }
        return arr[top];
    } */
    public static  String reverseStr(String str){
        Stack <Character> s1= new Stack<>();
       int idx=0;
       while(idx<str.length()){
         s1.push(str.charAt(idx));
         idx++;
       }
    //    while(!s1.isEmpty())
    //    {
    //     System.out.println(s1.peek());
    //     s1.pop();
    // }
     StringBuilder sb = new StringBuilder("");
      while(!s1.isEmpty()){
         char curr = s1.pop();
         sb.append(curr);
      }
      return sb.toString();
    }
    public static void main(String args[]){
    //    Stack s1= new Stack();
    String str ="MADAM";
  System.out.print(reverseStr(str));


     
       
    
        
      }

     

    }

