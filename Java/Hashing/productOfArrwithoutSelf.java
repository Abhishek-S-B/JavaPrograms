package Java.Hashing;

import java.io.*;
import java.util.*;
public class productOfArrwithoutSelf {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        int  n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long[] res = productExcept(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static long[] productExcept(int[] arr, int n) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < n; i++) {
//            map.put( i, arr[i]);
//        }
        long[] res = new long[n];
        long sum = 1;
//        for(int i = 0; i < n; i++) {
//            if(map.containsKey(i)){
//                int j = 0;
//                while(j < n) {
//                    if(i != j ){
//                        product = product * arr[j];
//
//                    }
//                    j++;
//                }
//            }
//            res[i] = product;
//            product = 1;
//        }
        for(int i = 0; i < n; i++) {
            sum *= arr[i];
        }
        for(int i = 0; i < n; i++) {
            long temp = 1;
            if(arr[i] == 0 ){
                res[i] = sum;
            }else if(arr[i] == sum) {
                res[i] = 0;
            }else {
                temp = sum / arr[i];
                res[i] = temp;
            }
        }
        return res;
    }
}