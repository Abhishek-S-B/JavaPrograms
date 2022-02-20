package Java.LinkedList;

import java.util.*;

public class delMiddleofList {

        public static void main(String args[]) {
            delMiddleofList list = new delMiddleofList();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                list.addLast(a);
            }

            list.delMiddleNode();
            list.printList();
            //your code here
        }
        Node head;
        int size = 0;
        static class Node {
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
        public void addLast (int data) {
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
        public int listSize() {

            if(head == null){
                return 0;
            }

            Node curr = head;
            while(curr != null)
            {
                curr = curr.next;
                size++;
            }
            return size;
        }

        public void printList() {
            if(isEmpty()) {
                return;
            }
            Node curr = head;
            int size = listSize();
            if(size == 1){
                System.out.print("-1");
                return;
            }
            while(curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }

        public void delMiddleNode() {
            if(isEmpty()) {
                return;
            }

            if (head.next == null) {
                return;
            }
            int sizeMN = listSize();
            Node curr = head;

            int middle = sizeMN/2;
            while(middle-- > 1)
            {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }

}
