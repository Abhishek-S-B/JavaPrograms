package Java.otherProgramsA;

import java.util.Scanner;

public class consecutiveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countZero(arr, n));
    }
    public static int countZero(int[] arr, int n){
        int maxCount = -1;
        int numOnes = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                numOnes++;
            }
            if(arr[i] == 0 || i == n-1){
                if(numOnes > maxCount){
                    maxCount = numOnes;
                }
                numOnes = 0;
            }
        }
        return maxCount;
    }
}
