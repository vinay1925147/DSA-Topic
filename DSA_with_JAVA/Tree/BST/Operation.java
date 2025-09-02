import java.util.ArrayList;

public class Operation {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insertNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);

    }

    public static boolean searchKey(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return searchKey(root.left, key);

        } else {
            return searchKey(root.right, key);
        }

    }

    public static Node deleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // case 1-- delete leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - delete single child node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 - two child node
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);

        }
        return root;

    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }
   public static void printInRange(Node root,int k1,int k2){
    if(root==null){
        return;
    }
    if(root.data>=k1 && root.data<= k2){
        printInRange(root.left, k1, k2);
        System.out.print(root.data+" ");
        printInRange(root.right, k1, k2);
    }
    else if(root.data<k1){
        printInRange(root.left, k1, k2);
    }
    else{
        printInRange(root.right, k1, k2);
    }

   }

   public static void printList(ArrayList<Integer> path){
      for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"->");
      }
      System.out.println("null");
   }
    public static void printPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printList(path);
        }
        printPath(root.left , path);
        printPath(root.right, path);
        path.remove(path.size()-1);

    }
    public static boolean isValidBst(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBst(root.left,min,root) && isValidBst(root.right,root, max);
    }
    public static void main(String[] args) {
        int values[] = {1,2,1, 4,5};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertNode(root, values[i]);
        }
        inOrder(root);
     
      
        // // System.out.println(searchKey(root, 13));
        // root = deleteNode(root, 14);
        // System.out.println();
        // inOrder(root);
        // // System.out.println();
        // // printInRange(root, 5, 12);
        // System.out.println();

        // printPath(root, new ArrayList<>());
        if(isValidBst(root, null, null)){
            System.out.println("valid");
        }
        else{
            System.out.println(" not valid");
        }
    }

}
