package Java.Arrays;

import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], secondMax = 0;
        for(int i = 0; i < n; i++) {
            if(max < arr[i]) {
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.print(secondMax);
    }
}
