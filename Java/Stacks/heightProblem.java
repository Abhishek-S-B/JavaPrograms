package Java.Stacks;

import java.util.*;
import java.lang.*;
public class heightProblem {
    public static void main (String[] args) throws java.lang.Exception
    {
                //nearest smallest element on left side
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && s.peek() >= arr[i] ) {
                s.pop();
            }
            if(s.isEmpty()){
                temp[i] = -1;
            }else {
                temp[i] = s.peek();
            }
            s.push(arr[i]);
            }
        for(int i=0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}