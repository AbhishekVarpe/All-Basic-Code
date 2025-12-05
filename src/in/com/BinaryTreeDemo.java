package in.com;

import java.util.LinkedList;
import java.util.Queue;

// Node class for tree structure
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeDemo {
    Node root;

    public BinaryTreeDemo() {
        root = null;
    }

    // Insert a node into the BST
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Calculate height of tree
    public int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Sum of all nodes
    public int sumOfNodes(Node root) {
        if (root == null)
            return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    // Find maximum node value
    public int maxNode(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int left = maxNode(root.left);
        int right = maxNode(root.right);
        return Math.max(root.data, Math.max(left, right));
    }

    // Find minimum node value
    public int minNode(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int left = minNode(root.left);
        int right = minNode(root.right);
        return Math.min(root.data, Math.min(left, right));
    }

    // Search for a value in the tree
    public boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Count total nodes
    public int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Count leaf nodes
    public int countLeafNodes(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    // Level order traversal (Breadth First Search)
    public void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }

    // Mirror (invert) the binary tree
    public Node mirror(Node root) {
        if (root == null)
            return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public void printNodesWithOnlyLeftChild(Node root) {
        if (root == null)
            return;

        if (root.left != null && root.right == null)
            System.out.print(root.data + " ");

        printNodesWithOnlyLeftChild(root.left);
        printNodesWithOnlyLeftChild(root.right);
    }

    // 🔹 Print nodes having only RIGHT child
    public void printNodesWithOnlyRightChild(Node root) {
        if (root == null)
            return;

        if (root.right != null && root.left == null)
            System.out.print(root.data + " ");

        printNodesWithOnlyRightChild(root.left);
        printNodesWithOnlyRightChild(root.right);
    }


    // ---------------- MAIN FUNCTION ----------------
    public static void main(String[] args) {
        BinaryTreeDemo tree = new BinaryTreeDemo();

        // Insertion
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Traversals
        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\n\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\n\nPostorder Traversal:");
        tree.postorder(tree.root);

        // Height
        System.out.println("\n\nHeight of Tree: " + tree.height(tree.root));

        // Sum of Nodes
        System.out.println("Sum of all Nodes: " + tree.sumOfNodes(tree.root));

        // Max/Min Node
        System.out.println("Maximum Node Value: " + tree.maxNode(tree.root));
        System.out.println("Minimum Node Value: " + tree.minNode(tree.root));

        // Search Operation
        int key = 40;
        System.out.println("Is " + key + " present? " + tree.search(tree.root, key));

        // Count Operations
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf Nodes: " + tree.countLeafNodes(tree.root));

        // Level Order Traversal
        System.out.println("\nLevel Order Traversal:");
        tree.levelOrder(tree.root);

        // Mirror Operation
        tree.mirror(tree.root);
        System.out.println("\n\nInorder After Mirror:");
        tree.inorder(tree.root);
        System.out.println("\n\nNodes having only LEFT child:");
        tree.printNodesWithOnlyLeftChild(tree.root);

        System.out.println("\nNodes having only RIGHT child:");
        tree.printNodesWithOnlyRightChild(tree.root);
    }
}
