package Java.LinkedList;
import java.util.*;

//All functions of Linked List
public class createLL {
    Node head;
   public class Node {
       int data;
       Node next;

       public Node(int data) {
           this.data = data;
           this.next = null;
       }
   }
   //Add element at first
       public void addFirst(int data) {
           Node newNode = new Node(data);
           if (head == null) {
               head = newNode;
               return;
           }
               newNode.next=head;
               head=newNode;
       }

       //Add element at last
       public void addLast(int data){
       Node newNode=new Node(data);
       if(head==null)
       {
           head=newNode;
           return;
       }
       Node currNode=head;
       while(currNode.next!=null){
           currNode=currNode.next;
       }
       currNode.next=newNode;
       }

       //delete first element
       public void deleteFirst(){
       if(head == null){
//           System.out.print("Empty");
           return;
       }
       head=head.next;
       }

       //delete last element
       public void deleteLast(){
       if(head==null){
           return;
       }
       Node secondLast=head;
       Node lastNode=head.next;
       while(lastNode.next!=null){
           lastNode=lastNode.next;
           secondLast=secondLast.next;
       }
       secondLast.next=null;
       }

       //reversing a linked list
       public void reverseLL(){
       Node curr=head;
       Node prev=null;
       while(curr!=null){
           Node temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
       }
       head=prev;
       }

       //add element at given position;
    public void addAnywhere(int i,int data){
       Node newNode =new Node(data);
    }

       public void printList() {
           if (head == null) {
               System.out.print("List is empty");
               return;
           }
           Node currNode = head;
           while (currNode != null) {
               System.out.print(currNode.data + "-->");
               currNode = currNode.next;
           }
           System.out.println("NULL");
       }
    public static void main(String[] args) {
        createLL list = new createLL();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      for(int i=0;i<n;i++){
           int a=sc.nextInt();
           list.addFirst(a);
       }
        list.printList();
    }
}