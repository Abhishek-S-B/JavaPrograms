package Java.Sorting;

import java.util.Scanner;

public class printRepeeatedEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(arr[j] > key &&  j>0) {
                j=i-1;
            }
            arr[j]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
