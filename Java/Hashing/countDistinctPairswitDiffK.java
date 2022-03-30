package Java.Hashing;

import java.util.*;

public class countDistinctPairswitDiffK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = countPairs(arr, n);
        System.out.print(res);
    }
    public static int countPairs(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, arr[i]);
            // if(map.containsKey())
        }
        return 0;
    }
}
