package Java.LinkedList;

import java.util.*;

public class swapNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LinkedList<Integer> list = new LinkedList<>();
        swapNodes list = new swapNodes();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        list.swap(x, y);
        list.printList();
    }
    public void swap(int x, int y) {
        if(head == null ){
            return;
        }
        Node prev = null, prevY = null;
        Node next = null, nextY = null;
        Node curr = head;
        while(curr.next != null && curr.data == x) {
            prev = curr;
            next = curr.next.next;
            curr = curr.next;
        }
        //Node currY = head;
        while(curr.next != null && curr.data == y) {
            prevY = curr.next;
            nextY = curr.next.next;
            curr = curr.next;
        }
    }
     Node head;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void add(int data) {
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
    }
    public void printList() {
        if(isEmpty()) {
            System.out.print("empty");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+ "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

}
