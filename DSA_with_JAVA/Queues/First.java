import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
class First{
static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
 
    static class Queue{
        int arr[];
        int size;
        int rear;
        int front ;
        Queue(int n){
           arr =new  int[n];
           size =n;
           rear =-1;
           front=-1;
        }
        // Node head=null;
        // Node tail=null;
        public boolean isEmpty(){
            return rear==-1 & front ==-1;
            // return tail==null;
        }
        public boolean isFull(){
            return (rear+1)%size == front;
        }
        public void add(int data){
            if(rear==-1){
                System.out.println("Queue is empty");
            }
            if(front ==-1){
                front++;
            }
           rear=(rear+1)%size;
           arr[rear]=data;
            // Node newnode = new Node(data);
            // if(head==null){
            //     head=tail=newnode;
            //     return;
            // }
            // tail.next=newnode;
            // tail=newnode;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("empty queue ");
                return -1;
            }
            int top =arr[front];
           if(rear==front){
               rear = front =-1;
           }
           else{
             front =(front+1)%size;
           }
           return top;
           
        //     int front = head.data;
        //     if(head==tail){
        //         head=tail=null;
        //     }
        //    else{
        //         head=head.next;
        //     }
        //     return front;
           
        }
    
        public int peek(){
            if(isEmpty()){
                System.out.println("empty queue ");
            }
            return arr[front];
            
        }
    }
       

    
public static void main(String args[]){
    Queue obj1 = new Queue(2);
    obj1.add(1);
    obj1.add(2);
    System.out.print(obj1.remove());
    obj1.add(6);
    System.out.print(obj1.remove());
    obj1.add(7);
    System.out.print(obj1.remove());
    obj1.add(8);
   while(!obj1.isEmpty()){
    System.out.print( " "+obj1.peek());
    obj1.remove();
}


    
} 
}
