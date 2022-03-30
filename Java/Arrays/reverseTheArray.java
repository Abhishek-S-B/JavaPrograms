package Java.Arrays;

import java.util.*;

public class reverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while(i < n/2 && j >= n/2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            if(i == j){
                break;
            }
            i++;
            j--;

        }
        for(int a : arr) {
            System.out.print(a+" ");
        }
    }
}
