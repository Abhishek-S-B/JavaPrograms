package Java.Hashing;

import java.util.*;
import java.lang.*;
import java.io.*;

public class firstEletoOccurKtimes
{
    public static void main (String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = firstele(arr, n, k);
        System.out.print(res);
    }
        public static int firstele(int[] arr, int n, int k) {
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            int[] freq = new int[max + 1];
            for (int i = 0; i < n; i++) {
                freq[arr[i]]++;
                if((freq[arr[i]]) == k)
                    return arr[i];


            }
            return -1;
    }
}