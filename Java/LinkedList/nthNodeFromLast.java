package Java.LinkedList;

import java.util.Scanner;

public class nthNodeFromLast {
    Node head;
    int size;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
//
    public void addLast (int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public int size() {
        if(head == null) {
            return 0;
        }
        Node curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }
        return size;
    }
    public void nthNodeFromLastLL(int nth) {
        int size = size();
        //call only function one time or assign it to variable and then use// if you use multiple time it will work recursively.
        if(head == null) {
            System.out.print("list is empty");
            return;
        }
        if(nth == 0 || nth < 0 || nth > size) {
            System.out.print("Not valid nth Node");
            return;
        }

        Node curr = head;

        int a = size - nth;
        for(int i = 0; i < a; i++) {
            curr = curr.next;
        }
        System.out.print(curr.data);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        nthNodeFromLast list = new nthNodeFromLast();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list.addLast(a);
        }
        int nth = sc.nextInt();
        list.nthNodeFromLastLL(nth);
    }

}
