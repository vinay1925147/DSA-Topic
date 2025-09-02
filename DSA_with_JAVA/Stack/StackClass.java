import java.util.*;

public class StackClass {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(1);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }
    }

}
