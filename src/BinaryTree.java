class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;

    }

    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }

    }

    void printInOrder() {
        inOrderTraversal(root);

    }

    public static void main(String[] args) throws Exception {
         BinaryTree tree = new BinaryTree();
         int[] elements = {50, 30, 20, 40, 70, 60, 80};
         for (int element : elements) {
            tree.insert(element);
         }
         tree.printInOrder();
    }
}
