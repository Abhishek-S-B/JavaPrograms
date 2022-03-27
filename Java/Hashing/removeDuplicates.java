package Java.Hashing;

import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        remove(arr,n);
    }
    public static void remove(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                map.remove(arr[i]);
            }
            map.put(arr[i], i);
        }
      map.forEach((k,v) -> System.out.print(k+ " "));
    }
}
