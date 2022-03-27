package Java.slidingWindow;

import java.util.*;

public class longestSubarryWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = countSubArr(arr,n,k);
        System.out.print(a);
    }
    public static int countSubArr (int A[], int N, int K) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen=0,sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                maxlen=i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-K)){
                if(maxlen<i-map.get(sum-K)){
                    maxlen=i-map.get(sum-K);
                }
            }
        }
        return maxlen;
    }

}
