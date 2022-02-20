package Java.LinkedList;

import java.util.Scanner;

public class exchangeNodes {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        exchangeNodes list = new exchangeNodes();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list.addLast(a);
        }
        list.exchangeNode(list);
        //list.printList();
    }
    Node head;
    Node tail;
    static class Node{
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        tail = curr.next;
    }

    public void printList() {
        if(isEmpty()) {
            System.out.print("list is empty.");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print(tail.data);
    }

    public void exchangeNode(exchangeNodes list) {
        if(isEmpty()) {
            return;
        }

        Node curr = list.head.next;
        System.out.print(tail.data + " ");
        while(curr.next != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println(head.data);
    }
}
