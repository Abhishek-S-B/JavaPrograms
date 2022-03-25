package Java.Queues;

import java.util.*;

public class queueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queueUsingArray q = new queueUsingArray(n);

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            q.enqueue(a,n);
        }
        System.out.print(q.element() + " ");
        System.out.print(q.element());
    }
    int rear;
    int[] arr;
    public queueUsingArray(int n) {
         rear = -1;
        arr = new int[n];
    }

    public void enqueue(int data, int n) {
        if(rear == n-1) {
            System.out.print("queue is full.");
            return;
        }
        rear++;
        arr[rear] = data;
    }
    public int dequeue() {
        if(rear == -1) {
            System.out.print("empty");
            return -1;
        }
        int res = arr[0];

        int i = 0;
        while (i < rear) {
            arr[i] = arr[i + 1];
            i++;
        }
        rear--;
        return res;
    }
    public int element() {
        return arr[0];
    }
}
