package Java.Searching;

import java.util.*;
public class count1BinA {
        public static void main (String[] args) throws java.lang.Exception
        {
            //your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            int[] arr = new int[n];
            for(int i =0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            // for(int i = 0; i < n; i++) {
            //   if(arr[i] == 1){
            //     count++;
            //     }
            // }
            System.out.print(binarySearch(arr, 0, n-1));
        }
        static int binarySearch(int[] arr,int s, int e) {

            if(s <= e){
                int mid = s + (e - s)/2;
                if((mid == e || arr[mid + 1] == 0) && (arr[mid] == 1)){
                    return mid+1;
                }else
                if(arr[mid] == 0){
                    return binarySearch(arr, s, mid-1);
                }else {
                    return binarySearch(arr, mid+1, e);
                }
            }
            return 0;
    }
}
