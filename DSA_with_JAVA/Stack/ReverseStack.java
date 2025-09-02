import java.util.*;
class ReverseStack{
    public static void pushAtbuttom1(StackClass<Integer> s ,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbuttom1(s,data);
        s.push(top);

    }
    public static void pushAtbuttom2(StackClass<Integer> s , int data){
    StackClass<Integer> temp = new StackClass<>();
      while(!s.isEmpty()){
        int top = s.pop();
        temp.push(top);
      }
      s.push(data);
      while(!temp.isEmpty()){
        int top1=temp.pop();
        s.push(top1);
      }
      
    }
    public static void revStack(StackClass<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revStack(s);
        pushAtbuttom1(s,top);
    }
    public static void  print(StackClass<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        StackClass<Integer> s = new StackClass<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtbuttom1(s,4);
        // pushAtbuttom2(s, 4);
        revStack(s);
        print(s);
       
    }
}