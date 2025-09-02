import java.util.*;

    class Second {
      public static void reverseQusingRecursion(Queue<Integer> q){
        if(q.isEmpty()){
          return;
        }
          int front=q.peek();
          q.remove();
          reverseQusingRecursion(q);
          q.add(front);
      }
     public static void main(String args[]){

      Queue<Integer> q =new LinkedList<>(); // Linked List
      StackClass<Integer> s=new StackClass<>();
      //  q.add(1);
      // //  q.add(2);
      //  q.add(3);
      reverseQusingRecursion(q);
      for(int i=1; i<=100;i++){
         q.add(i);
      }
      System.out.println(q);

       
       while(!q.isEmpty()){
         System.out.print(q.peek());
         q.remove();
       }
     }
}
