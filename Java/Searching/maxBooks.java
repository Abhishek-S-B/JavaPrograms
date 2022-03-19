package Java.Searching;

import java.util.*;
import java.lang.*;

public class maxBooks
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(t == 0 || t < 0 || t > n)
            System.out.print("0");
        else
            System.out.print(countBook(arr, n, t));
    }
    static int countBook(int[] arr, int n, int t) {
        int countOfBooks = 0;
        int sum = 0;
        int j = 0;
        for(int i=0; i < n;i++) {
            sum += arr[i] ;
            if(sum  <= t){
                countOfBooks++;
            } else {
                sum = sum - arr[j];
                j++;
            }
        }
        return countOfBooks;
    }
}