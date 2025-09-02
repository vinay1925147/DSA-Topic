import java.util.*;
public class LLcollection {
    public static void main(String args[]){
       LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.addFirst(3);
        ll.addLast(5);
        ll.add(4);
        ll.add(1,32);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        System.out.println(ll.get(2));
    }
}
