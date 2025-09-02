import java.util.*;
public class AddtwoNum {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head1;
    static Node head2;
    static Node head;
    static Node tail;

    public static Node reverse(Node head) {
      Node prev=null;
      Node curr=head;
      while(curr!=null){
        Node newnext = curr.next;
        curr.next=prev;
        prev=curr;
        curr=newnext;
      }
      head=prev;
      return head;
    }

    public static void addList(Node head1, Node head2) {
        Node temp1 = reverse(head1);
        Node temp2 =reverse(head2);
        int carry = 0 ;
        Node list;

        while (temp1 != null || temp2 != null || carry != 0) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }

            list = new Node(sum % 10);
            carry = sum / 10;
            if (head == null) {
                head = tail = list;

            }
            tail.next = list;
            tail = tail.next;

        }
    }

    public static void printList(Node head) {
        Node temp =reverse(head);
        while (temp != null) {
            System.out.print("->"+temp.data  );
            temp = temp.next;
        }

    }

    public static void main(String args[]) {
        //   head1 = new Node(0);
        // head1.next = new Node(8);

        // head1.next.next = new Node(3);
        // head1.next.next = new Node(3);
        // head1.next.next.next = new Node(4);
        // head1.next.next.next.next = new Node(5);

        // head2 = new Node(0);
        // head2.next = new Node(3);
        // head2.next.next = new Node(4);
        // head2.next.next.next = new Node(5);
        // head2.next.next.next.next = new Node(6);

        addList(head1, head2);
        printList(head);

    }
    
}
