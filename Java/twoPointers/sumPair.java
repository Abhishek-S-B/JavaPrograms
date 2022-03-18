package Java.twoPointers;

import java.util.Scanner;

public class sumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfPairNum(arr, n, T));
    }
    public static int sumOfPairNum(int[] arr, int n, int Target) {
        int i = 0, j = n-1;
//        if(arr[i] == Target || arr[j] == Target)
//            return 1;
        while(i < j) {
            if((arr[i] + arr[j])==Target)
                return 1;
            else if((arr[i] + arr[j]) > Target)
                j--;
            else
                i++;
        }
        return 0;
    }

}
