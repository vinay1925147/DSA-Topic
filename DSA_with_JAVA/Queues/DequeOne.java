import java.util.*;
 class DequeOne {
   static class Queue{
        Deque<Integer> d = new LinkedList<>();
      public boolean isEmpty(){
            return d.isEmpty();
        }
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
          int top=  d.removeFirst();
          return top;
        }
        public int peek(){
            return d.getFirst();
        }
    }

    
    public static void main(String args[]){
        //  Deque<Integer> q= new LinkedList<>();
      
       Queue s =new Queue();
       s.add(1);
       s.add(2);
       s.add(3);
       s.add(4);
       while(!s.isEmpty()){
        System.out.print(s.peek()+" ");
        s.remove();
       }

    }
}

