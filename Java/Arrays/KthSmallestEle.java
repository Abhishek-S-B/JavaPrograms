package Java.Arrays;

import java.util.Scanner;

public class KthSmallestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(kthSmallest(arr,k));
    }
    public static int kthSmallest(int[] arr, int k)
    {
        //Your code here
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        int[] freq = new int[max+1];
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int count = 0;
        for(int i = 0; i <= max; i++) {
            if(freq[i] == 1) {
                count++;
                if(count == k){
                    return i;
                }
            }
        }
        return -1;
    }
}
