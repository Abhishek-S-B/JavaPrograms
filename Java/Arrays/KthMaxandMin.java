package Java.Arrays;

import java.util.*;

public class KthMaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max){
                    max = arr[i];
            }
        }
       int[] freq = new int[max+1];
        for(int i = 0; i < max; i++) {
            freq[arr[i]]++;
        }


        int j = max, countmax = 0;
        int maxResult = 0;
        while(j >= 0) {
            if(freq[j] == 1) {
                if (countmax == k) {
                    maxResult = j;
                    break;
                }
                countmax++;
            }
            j--;
        }

        int i = 0, countmin = 0;
        int minResult = 0;
        while(i <= max) {
            if(freq[i] == 1) {
                if (countmin == k) {
                    minResult = i;
                    break;
                }
                countmin++;
            }
            i++;

        }

        System.out.println( "Kth max " + maxResult );
        System.out.println( "Kth min " + minResult );
    }
}
