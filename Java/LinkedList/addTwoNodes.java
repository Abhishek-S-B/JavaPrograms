package Java.LinkedList;

import java.util.Scanner;

public class addTwoNodes {
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
    public void addList(addTwoNodes list_1, addTwoNodes list_2)
    {
        Node curr_1 = list_1.head;
        Node curr_2 = list_2.head;
        int addition_l1 = 0, addition_l2 = 0;
        while(curr_1 != null && curr_2 != null){
            if(curr_1.data != curr_2.data ){
                addition_l1 += curr_1.data;
                curr_1 = curr_1.next;
                curr_2 = curr_2.next;
            }
            else{
                addition_l1 += curr_2.data;
                curr_2 = curr_2.next;
            }
//           if(curr_1.data == curr_2.data) {
//               addition += curr_1.data;
//               curr_1 = curr_1.next;
//           }
//           else{
//               addition += curr_2.data;
//               curr_2 = curr_2.next;
//           }
           //curr_1 = curr_1.next;
            System.out.println(addition_l1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addTwoNodes list_1 = new addTwoNodes();
        addTwoNodes list_2 = new addTwoNodes();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list_1.addLast(a);
        }
        list_1.printList();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            list_2.addLast(a);
        }
        list_2.printList();
        addTwoNodes list_3 = new addTwoNodes();
        list_3.addList(list_1, list_2);


    }
}
