import java.util.*;
public class Twostack {
    
      static class Queue{
        StackClass<Integer> s1 = new StackClass<Integer>();
        StackClass<Integer> s2 = new StackClass<Integer>();
        public boolean isEmpty(){
            return s1.isEmpty() ;
        }
        public void add(int data){
            s1.push(data);
            // while(!s1.isEmpty()){
            //     s2.push(s1.pop());
            // }

            // s1.push(data);

            // while(!s2.isEmpty()){
            //     s1.push(s2.pop()); 
            // }
         
        }
        public  int remove(){
        //     // if(s1.isEmpty()){
        //     //     System.out.println("queue is empty");
        //     //     return -1;
        //     // }
        //    return  s1.pop();
        while(!s1.isEmpty()){
           s2.push(s1.pop());
        }
        int top;
        while(!s2.isEmpty()){
         s1.push(s2.pop());
        }
        return s1.pop();

        }
        public int peek(){
            // if(s1.isEmpty()){
            //     System.out.println("queue is empty");
            //     return -1;
            // }
            return s1.peek();
        }
        
    }
    public static void main (String args[]){
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
       
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
