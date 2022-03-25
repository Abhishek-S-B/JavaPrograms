package Java.Arrays;
//
//import java.util.*;
//public class nxtSmallerEle
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i<n; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        int[] res = new int[n];
//        Arrays.fill(res, -1);
//        int  i = 0;
//        int c = 0;
//        int j = i + 1;
//        while(i < j && j < n) {
//            c = arr[i];
//            if(arr[i] < arr[j]) {
//                res[j] = arr[i];
//                j++;
//            }else if(res[i] < arr[j]){
//                res[j] = res[i];
//            } else if(res[i-1] < arr[j]){
//                res[j] = res[i - 1];
//            }
//            i++;
//            j = i+1;
//        }
//        for(int a: res) {
//            System.out.print(a+" ");
//        }
//    }
//}
import java.util.*;
public class nxtSmallerELe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
        int[] res = smallertoleft(arr,n);
        for(int a: res)
            System.out.print(a+" ");
    }
    static int[] smallertoleft(int arr[],int n){
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            freq[i]=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    freq[i]=arr[j];
                    break;
                }
            }
        }
        return freq;
    }
}
