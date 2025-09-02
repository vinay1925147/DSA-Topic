import java.util.ArrayList;
public class BasicLL{
    public static class Node{
      int data;
      Node next;    // to point the next node(obj)
        Node(int data){
            this.data= data;
            this.next=null;
        } 
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
       Node newnode=new Node(data);
       if(head==null){
        head=tail=newnode;
        return;
       }
       size++;
       newnode.next = head;
       head = newnode;

    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        size++;
        tail.next=newnode;
        tail=newnode;
    }
    public void add(int data,int idx){
        Node newnode=new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        size++;
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removeFirst(){
        int val=head.data;
        if(head==null){
           System.out.println("list is empty");

        }
        else if(size==1){
            head= tail=null;
            return val;
        }
        
        head = head.next;
        return  val ;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("list is empty");
        } else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<5;i++){
            prev =prev.next;
        }
        int val =prev.next.data;
        prev.next=null;
        tail=prev;
        // size--;
        return val;
     }
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
         }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        size++;
        System.out.println("null");
    }
    public int searchKey(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
           if(key==temp.data){
               return i;
            }
            temp=temp.next;
           i++;
         }
         return -1;
     }
     public int isCount(int size){
          Node curr=head;
          while(curr!=null){
           curr=curr.next;
           size++;
        }
    //    System.out.println("size of whole list: "+size)jj;
        return size;
     }
     public void mid(){
        if(head==null){
            return ;
        }
      int length= isCount(0);
      int Middlevalue=(length/2)+1;
        System.out.println("mid position is: "+Middlevalue);
      Node temp=head;
      while(temp!=null){
        Middlevalue--;
        if(Middlevalue==0){
            break;
         }
     temp=temp.next;
  }
      System.out.println("mid value is:"+temp.data);
    }
    public static void main(String[] args) {
      BasicLL ll =new BasicLL();

      ll.addlast(1);  ll.addlast(2); ll.addlast(3); ll.addlast(4); ll.addlast(5);
       ll.addlast(1); ll.addlast(1);
   
//       int arr[]={1,2,3,4,5};
//       ArrayList<Integer> list=new ArrayList<>();
//       list.add(1);list.add(2);list.add(3);
//    String str="vinay";

//     /// Array to linked list
//       for(int i=arr.length-1;i>=0;i--){
//        ll.addfirst(arr[i]);
//         }

//     /// Arraylist to linked list
//      for(int i=list.size()-1;i>=0;i--){
//         ll.addfirst(list.get(i));
//      }

//      //// String to Linked list
//        for(int i=str.length()-1;i>=0;i--){
        
//        }
    //   ll.print();
    //   ll.addfirst(2);
    //   ll.addfirst(1);
    //   ll.addlast(4);
    // //   ll.add(5,4);
    //   ll.addlast(6);
    //   ll.print();
    // //   ll.removeFirst();
    // //   ll.print();
    // //   ll.removeLast();
    // //   ll.print();
   
    // System.out.println( " value of index :"+ll.searchKey(4)); 
    // ll.mid();
   } 
}
 
    