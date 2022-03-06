package Java.Hashing;

import java.util.Scanner;

public class containsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.print(checkDupli(arr));
        //checkDupli(arr);
    }
    public static boolean checkDupli(int[] arr) {
        int max = arr[0];
        for(int v: arr) {
            if(v > max)
                max = v;
        }

        int[] freq = new int[max+1];
        for(int i = 0; i <arr.length; i++) {
            freq[arr[i]]++;
        }
        for(int i = 0; i <= max; i++) {
            if (freq[i] > 1)
                return true;
        }
        return false;
    }
}
