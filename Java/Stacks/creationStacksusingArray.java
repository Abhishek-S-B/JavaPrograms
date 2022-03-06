package Java.Stacks;

import java.util.Scanner;

public class creationStacksusingArray {

    Scanner sc = new Scanner(System.in);
    static final int MAX = 1000;
    int top;
    int[] arr = new int[MAX];
    boolean isEmpty() {
        return top < -1;
    }
    creationStacksusingArray() {
        top = -1;
    }
    //push operation
    boolean push() {
        if(top == MAX-1){
            System.out.println("Stack overflow.");
            return false;
        }
        else {
            int x = sc.nextInt();
            arr[++top] = x;
            return true;
        }
    }

    //pop operation
    int pop() {
        if(top < 0) {
            System.out.println("stack underflow.");
            return 0;
        }
        else {
          int p =arr[top--];
          return p;
        }
    }

    //peek operation
    int peek() {
        if(top < 0 ) {
            System.out.println("stack underflow.");
            return 0;
        }
        else {
            int pk = arr[top];
            System.out.println("peeked element: "+pk + " ");
            return pk;
        }
    }

    //printing the elements.
    void print () {
        if(top < 0 ) {
            System.out.println("Stack Underflow.");
            return;
        }
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        creationStacksusingArray operation = new creationStacksusingArray();
        int choose = 0;
        while(choose < 5) {
            System.out.println("Choose the operation to perform: ");
            System.out.println("1.push\t 2.pop \t 3.peek \t 4.print");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                System.out.println("Enter element to push: ");
                operation.push();
                break;

                case 2:
                operation.pop();
                break;

                case 3:
                operation.peek();
                break;

                case 4:
                operation.print();
                break;
                default:
                    System.out.println("Enter valid choice.");
                    break;
            }
        }
    }
}
