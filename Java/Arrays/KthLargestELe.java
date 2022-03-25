package Java.Arrays;

import java.util.*;

public class KthLargestELe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(Klargest(arr,k));
    }
    public static ArrayList<Integer> Klargest(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        int count = 0;
        int[] freq = new int[max+1];
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for(int i = max; i >= 0; i--) {
            while(freq[i] == 1) {
                count++;
                freq[i]--;
                if(count <= k) {
                    list.add(i);
                }
            }

        }
        return list;
    }
}
