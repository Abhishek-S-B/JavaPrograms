package Java.LinkedList;

import java.util.*;

public class practiceLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void deleteFirst() {
        if (isEmpty()) {

            return;
        }

        head = head.next;

    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast = null;
    }

    public void deleteNode(int position)
    {
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;
    }


    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practiceLL list = new practiceLL();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.addFirst(a);
        }

        //list.deleteNode(2);
        list.printList();
    }

}