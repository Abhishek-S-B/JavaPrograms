package Java.Stacks;

import java.util.Scanner;

public class creationStackusingLinkedList {
    Node head;
    Node tail;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //push operation
    void push(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        if(head.next == null){
            tail = head;
        }
        head = newNode;
    }

    //pop operation
    void pop() {
        if(head == null) {
            System.out.print("List is empty.");
            return;
        }else {
            //to pop first element
            head = head.next;
        }
//        Node secondLast = head;
//        Node lastNode = head.next;
//        while(lastNode != null) {
//            lastNode = lastNode.next;
//            secondLast = secondLast.next;
//        }
//        secondLast.next = null;
    }

    //peek operaion
    void peek () {
        if (head == null) {
            System.out.print("list is empty.");
            return;
        }
        int x = tail.data;
        System.out.println(x + " ");
    }
    void print() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        creationStackusingLinkedList operation = new creationStackusingLinkedList();
        operation.push(1);
        operation.push(22);
        operation.push(2);
        operation.push(3);
        operation.pop();
        operation.peek();
        operation.print();
    }

}
