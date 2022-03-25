package Java.Stacks;

import java.util.*;

public class stackSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            s.push(arr[i]);
        }
        int[] result = new int[arr.length];

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            int j = i;
            while (j >= 0) {
                if (!s.isEmpty() && s.peek() >= arr[j] ) {
                    count++;
                    j--;
                }else
                    break;
            }
            s.pop();
            result[i] = count;
        }
        for (int a : result)
            System.out.print(a + " ");
    }
}
