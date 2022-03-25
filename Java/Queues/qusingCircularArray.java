package Java.Queues;

import java.util.*;

public class qusingCircularArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        qusingCircularArray q = new qusingCircularArray(n);
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            q.enqueue(a,n);
        }
        System.out.print(q.dequeue(n));
        System.out.print(q.dequeue(n));
        System.out.print(q.dequeue(n));
        System.out.print(q.dequeue(n));
        System.out.print(q.dequeue(n));
        System.out.print(q.dequeue(n));

    }

     int[] arr ;
    static int front, rear;
    qusingCircularArray(int n) {
        arr = new int[n];
        front = -1;
        rear = -1;
    }
    public  void enqueue(int data, int n) {
        if(((rear + 1) % n) == front ) {
            System.out.print("Queue is full.");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear = (rear + 1) % n;
        arr[rear] = data;
    }
    public  int dequeue(int n) {
        if(front == -1) {
            System.out.print("queue is empty.");
            return -1;
        }
        int res = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % n;
        }


        return res;
    }

}
