package Java.Arrays;

import java.util.*;
public class closestNumber {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        for(int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        int min_diff = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++) {
            if(arr[i+1] - arr[i] < min_diff){
                min_diff = arr[i+1] - arr[i];
            }
            if(min_diff == 50)
                System.out.print(arr[i]+ " " );
        }
    }
}
