package Java.LinkedList;
import java.lang.*;
import java.util.*;

public class practiceVLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        }
        Node Curr = head;
        newNode.next =Curr;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        }
        Node Curr = head;
        if (Curr.next != null) {
            Curr = Curr.next;
        }
        Curr.next = newNode;
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = null;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        Node n = head;
        head = n.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        practiceVLL list = new practiceVLL();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.addFirst(a);
        }
        // list.deleteFirst();
        // list.addFirst(9);
        // list.addLast(10);
        list.printList();

    }
}