import java.util.*;

public class Basic {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;

    static class Binarytree {
        static int idx = -1;

        public static void printList() {
            if (root == null) {
                System.out.println("tree is empty");
            }
        }

        ////// Build tree
        public Node printNode(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(Nodes[idx]);
            // System.out.print(" "+newnode.data);
            newnode.left = printNode(Nodes);
            newnode.right = printNode(Nodes);
            return newnode;

        }

        static int count = 0;

        ///// preorder
        public boolean preorder(Node root, int key) {

            if (root == null) {
                // System.out.print("-1");
                return false;
            }
            // System.out.print(" " + root.data);
            if (root.data == key) {
                return true;
            } else {
                preorder(root.left, key);
                preorder(root.right, key);

            }
            return true;

        }

        ////// Inorder
        public void inOrder(Node root) {
            if (root == null) {
                // System.out.print("-1");
                return;
            }
            inOrder(root.left);
            System.out.print(" " + root.data);
            inOrder(root.right);
        }

        ///// postOrder
        public void postOrder(Node root) {
            if (root == null) {
                System.out.print("-1");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.data);
        }

        //// LevelOreder
        public void levelOrder(Node root) {
            if (root == null) {
                // System.out.print("-1");
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            // q.add(null);
            while (!q.isEmpty()) {
                Node curNode = q.remove();
                // if (curNode == null) {
                //     System.out.println(" ");
                //     if (q.isEmpty())
                //         break;
                //     else
                //         q.add(null);
                // }

                // else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null)
                        q.add(curNode.left);

                    if (curNode.right != null)
                        q.add(curNode.right);
            

            }
        }
    }

    public int find_Height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = find_Height(root.left);
        int rh = find_Height(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }

    public int find_Count(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = find_Count(root.left);
        int rc = find_Count(root.right);
        int total_cnt = (lc + rc) + 1;
        return total_cnt;
    }

    public int find_Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int left_sum = find_Sum(root.left);
        int right_sum = find_Sum(root.right);
        int tree_sum = (left_sum + right_sum) + root.data;
        return tree_sum;
    }

    public int find_Diamtr(Node root) {
        if (root == null) {
            return 0;
        }
        int ld = find_Diamtr(root.left);
        int lh = find_Height(root.left);
        int rd = find_Diamtr(root.right);
        int rh = find_Height(root.right);

        int selfDia = lh + rh + 1;
        int max_Dia = Math.max(selfDia, Math.max(ld, rd));
        return max_Dia;

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // Basic tree1 = new Basic();
        Binarytree tree = new Binarytree();
        // Node root = tree.printNode(nodes);

        // tree.inOrder(root);
        // tree.postOrder(root);
       

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(6);
        // System.out.println(tree.preorder(root, 5));
         tree.levelOrder(root);
        // System.out.println(" height of tree is :"+tree1.find_Height(root));
        // System.out.println("count of total nodes is : "+tree1.find_Count(root));
        // System.out.println("Diametr of tree is : "+tree1.find_Diamtr(root));
        // System.out.println("sum of total nodes is : "+tree1.find_Sum(root));
    }
}
