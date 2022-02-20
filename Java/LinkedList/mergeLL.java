package Java.LinkedList;

import java.util.Scanner;

public class mergeLL {
    Node head;
    Node tail;
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        Node curr = head;
        tail = null;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        tail = curr.next;
    }

    public void printList()
    {
        if(isEmpty()){
            System.out.print("list is empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

        System.out.println("null");
        //
    }

    Node merge(Node head1 , Node head2)
    {
        Node dummy = new Node(0);
        Node tail = dummy;
        while(true)
        {
            if(head1 == null){
                tail.next = head2;
                break;
            }
            if(head2 == null){
                tail.next = head1;
                break;
            }
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }
            else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
       return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mergeLL list_1 = new mergeLL();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list_1.addLast(a);
        }
        list_1.printList();

        mergeLL list_2 = new mergeLL();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            list_2.addLast(a);
        }
        list_2.printList();

        list_1.head = new mergeLL().merge(list_1.head, list_2.head);
        list_1.printList();
    }
}
