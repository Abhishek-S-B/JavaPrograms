package Java.Queues;

import java.util.*;

public class queueusingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.enqueue(a);
        }
        list.print();
        list.dequeue();
        System.out.println();
        list.print();

    }
    static class LL {
       static Node front, rear;

        static class Node {
            Node next;
            int data;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void enqueue(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = newNode;
                rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        public static void dequeue() {
            if(front == null) {
                return;
            }
            //System.out.print(front.data);
            front = front.next;
        }
        public static void print() {
            if(front == null) {
                System.out.print("List is empty");
                return;
            }
            Node curr = front;
            while(curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }

        }
    }
}
