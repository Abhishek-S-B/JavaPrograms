package Java.LinkedList;

import java.util.Scanner;

//https://leetcode.com/problems/add-two-numbers/
public class addTwoNumbersLC {
    private Node head;
    private static class Node
    {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void printList()
    {
        if(isEmpty()){
            System.out.print("List is empty.");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addTwoNumbersLC list_1 = new addTwoNumbersLC();
        addTwoNumbersLC list_2 = new addTwoNumbersLC();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list_1.addLast(a);
        }
        list_1.printList();

    }
}
