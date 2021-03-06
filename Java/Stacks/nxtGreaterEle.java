package Java.Stacks;

import java.util.*;

public class nxtGreaterEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int a: printNGE(arr)) {
            System.out.print(a+" ");
        }
//        Stack<Integer> s2  = new Stack<>();
//        for(int i = 0; i < n-1; i++) {
//            s.push(arr[i]);
//            if(s.peek() < arr[i+1]) {
//                s2.push(arr[i+1]);
//            } else {
//                int j = i+1;
//                while(j < n) {
//                    if(s.peek() < arr[j]) {
//                      s2.push(arr[j]);
//                      break;
//                    }
//                    j++;
//                }
//            }
//
//        }
//        s2.push(-1);
//        System.out.print(s2);
        //int[] print = greater(arr)
    }
    public static int[] printNGE(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];

        // iterate for rest of the elements
        for (int i = arr.length - 1; i >= 0; i--)
        {
            /* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
            if (!s.empty())
            {
                while (!s.empty()
                        && s.peek() <= arr[i])
                {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        return nge;
    }
}
