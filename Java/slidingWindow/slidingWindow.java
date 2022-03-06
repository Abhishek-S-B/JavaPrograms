package Java.slidingWindow;

import java.util.Scanner;

public class slidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        slidingWindow sld = new slidingWindow();
       // System.out.print(sld.maxSumBrtFrc(arr, n, k));
        System.out.print(sld.maxSumOptimized(arr, n, k));
    }
    //Brute Force method TC = O(n*k)
    public int maxSumBrtFrc(int[] arr, int n, int k) {
        int max_sum = 0;
        for(int i = 0; i < n - k +1; i++) {
            int curr_sum = 0;
            for(int j = 0; j < k; j++) {
                curr_sum += arr[i+j];
            }
            max_sum = Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }

    //Optimized solution TC = O(n)
    public int maxSumOptimized(int[] arr, int n, int k) {
        int max_sum = 0;
        for(int i = 0; i < k; i++){
            max_sum += arr[i];
        }
        int window_sum = max_sum;
        for(int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(window_sum, max_sum);
        }
        return max_sum;
    }
}
