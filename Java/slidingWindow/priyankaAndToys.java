package Java.slidingWindow;

import java.util.*;

public class priyankaAndToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = countContainer(arr,n);
        System.out.print(res);
    }
    public static int countContainer(int[] arr, int n) {
        int count = 1;
        int a = arr[0];
        for(int i = 0; i < n; i++) {

            if(arr[i] > a+4) {
                count++;
                a = arr[i];
            }
        }
        return count;
    }
}
