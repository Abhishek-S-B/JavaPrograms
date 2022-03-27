package Java.Trees;

import java.util.*;

public class createBinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
    static Node createTree() {
        Node root = null;
        System.out.print("enter data: ");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter at left Node: ");
        root.left = createTree();
        System.out.println("Enter at Right Node: ");
        root.right = createTree();

        return root;
    }
    static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class Node {
    Node left, right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
