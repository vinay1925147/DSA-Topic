import java.util.*;

public class Operation2 {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static Node sortedArrayToBST(int arr[], int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(arr[mid]);
        root.left = sortedArrayToBST(arr, si, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, ei);
        return root;
    }

    public static Node srtBst(ArrayList<Integer> list, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(list.get(mid));
        root.left = srtBst(list, si, mid - 1);
        root.right = srtBst(list, mid + 1, ei);
        return root;

    }

    public static void getInOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, list);
        list.add(root.data);
        System.out.println(list);
        getInOrder(root.right, list);
    }

    public static Node mergeBSTs(Node root1, Node root2) {
        // create sort list 1
        ArrayList<Integer> list1 = new ArrayList<>();
        getInOrder(root1, list1);
        // crete sorted list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        getInOrder(root2, list2);

        // merge pf two sorted list
        ArrayList<Integer> finallist = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i)<=list2.get(j)) {

                finallist.add(list1.get(i));
                i++;

            } else {
                finallist.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {  
            finallist.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            finallist.add(list2.get(j));
            j++;
        }
       System.out.println(finallist);
        // convert the merge sorted list to belence BST
        int arr[]=new int[finallist.size()];
         for(int k=0;k<arr.length;k++){
            arr[k]=finallist.get(k);
         }
        return sortedArrayToBST(arr, 0, finallist.size() - 1);

    }

    public static void main(String[] args) {
        // int arr[] = { 3, 5, 6, 8, 10, 11, 14 };
        // Node root= sortedArrayToBST(arr,0,arr.length-1);
        // preOrder(root);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preOrder(root);

    }

}
