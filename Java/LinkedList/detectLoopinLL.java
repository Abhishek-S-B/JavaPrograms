package Java.LinkedList;

import java.util.Scanner;

public class detectLoopinLL {
    Node head;
    static class Node {
        int data;
        Node next;
        int flag;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.flag = 0;
        }
    }
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
//using flag bit
    public boolean detectLoop() {
        if(head == null) {
            System.out.print("null");
            return false;
        }
        while(head != null) {
            if(head.flag== 1)
                return true;

            head.flag = 1;
            head = head.next;
        }
        return false;
    }
    //using floyd's algorithm
//    public boolean detectLoop() {
//        if(head == null) {
//            System.out.println("null");
//            return false;
//        }
//        Node slow = head;
//        Node speed = head;
//        while (speed.next != null){
//            slow = slow.next;
//            speed = speed.next.next;
//            if(speed == null)
//                return false;
//
//
//            if(speed == slow)
//                return true;
//        }
//        return false;
//    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        detectLoopinLL list = new detectLoopinLL();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.addLast(a);
        }
        list.head.next.next.next.next = list.head;
        if(list.detectLoop())
            System.out.print("in loop");
        else
            System.out.print("not in loop");
    }
}
