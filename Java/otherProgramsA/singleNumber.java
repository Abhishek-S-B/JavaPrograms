package Java.otherProgramsA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(singleNum(arr,n));
    }
    public static int singleNum(int[] arr, int n){
        Arrays.sort(arr);
        for(int i = 0; i < n - 1; i += 2){
            if(arr[i] != arr[i+1])
                return arr[i];
        }
        return arr[n - 1];
    }
}
