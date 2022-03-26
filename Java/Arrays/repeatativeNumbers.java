package Java.Arrays;
//input -  1 1 2 2 2 3 3 3 4 4 4 4
//output - 4
//input - 1 2 2 3 3 3 4 4 4
//output - 3

import java.util.*;

public class repeatativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        int[] freq = new int[max+1];
        for(int i = 0;i < n; i++) {
            freq[arr[i]]++;
        }
        int maxfr = freq[0];
        for(int i = 0; i <= max; i++) {
            if(freq[i] > maxfr) {
                maxfr = freq[i];
            }
        }
        int res = 0;
        for(int i = 0; i <= max; i++) {
            if(maxfr == freq[i]) {
                res = i;
                break;
            }
        }
        System.out.print(res);
    }
}
