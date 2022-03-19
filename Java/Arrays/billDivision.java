package Java.Arrays;

import java.util.*;
import java.lang.*;

public class billDivision
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        int sum = 0;
        for(int i = 0; i< n; i++) {
            if(i == k) {
                continue;
            }else {
                sum += arr[i];
            }
        }
        int avg = 0;
        avg = sum / 2;
        if(amt > avg ) {
            System.out.print(amt-avg);
        }else {
            System.out.print("Bon Appetit");
        }
    }
}