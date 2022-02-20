package Java.LinkedList;
import java.io.*;
import java.util.*;
public class compare2LL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        compare2LL list1 = new compare2LL();
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            int a = sc.nextInt();
            list1.addLast(a);
        }
        compare2LL list2 = new compare2LL();

        for(int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            list2.addLast(a);
        }

        compare2LL list3 = new compare2LL();
        System.out.print(list3.compareList(list1 ,m , list2, n));
    }


    Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
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

    public void printList() {
        if(head == null){
            System.out.print("0");
            return;
        }

        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public int compareList(compare2LL list1, int m, compare2LL list2, int n){
        if(m != n){
            return 0;
        }
        int flag = 0;
        Node curr1 = list1.head;
        Node curr2 = list2.head;
        while(curr1 != null && curr2 != null){
            if(curr1.data != curr2.data){
                return 0;
            }
            flag++;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        if(flag == m)
            return 1;
        return 0;
    }
}

