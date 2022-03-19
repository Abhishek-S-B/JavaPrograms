package Java.Searching;

import java.util.*;
import java.lang.*;
import java.io.*;

public class floorinSR
{
    static  int count = 0;
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Key = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(binarySearch(arr, 0, n-1, Key));
    }
    static int binarySearch(int[] arr,int s, int e, int Key) {

        if(Key < arr[0]){
            return -1;
        }else if(Key > arr[arr.length-1]){
            return -1;
        } else
        if(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] < Key && arr[mid+1] > Key){
                return mid;
            } else
            if(arr[mid] == Key) {
                return mid;
            } else
            if(arr[mid] > Key) {
                return binarySearch(arr, 0, mid - 1, Key);
            } else if(arr[mid] <= Key) {
                count = mid;
                return binarySearch(arr, mid+1, e, Key);
            }
        }
        return count;
    }
}