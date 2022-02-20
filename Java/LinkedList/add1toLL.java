package Java.LinkedList;

import java.util.Scanner;

public class add1toLL {
    public static void main(String args[]) {
        //your code here
        add1toLL list = new add1toLL();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        n = n + 1;
        long rem = 0;
        while(n > 0){
            rem = n % 10;
            list.addLast(rem);
            n = n / 10;
        }
        list.printList();
    }
    Node head;
    Node tail;
    static class Node {
        long data;
        Node next;
        public Node(long data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(long data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if(head == null) {
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

}
