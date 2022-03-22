package Java.Stacks;

import java.util.*;

public class nxtGreaterEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> s  = new Stack<>();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        Stack<Integer> s2  = new Stack<>();
        for(int i = 0; i < n-1; i++) {
            s.push(arr[i]);
            if(s.peek() < arr[i+1]) {
                s2.push(arr[i+1]);
            } else {
                int j = i+1;
                while(j < n) {
                    if(s.peek() < arr[j]) {
                      s2.push(arr[j]);
                      break;
                    }
                    j++;
                }
            }

        }
        s2.push(-1);
        System.out.print(s2);
    }
}
