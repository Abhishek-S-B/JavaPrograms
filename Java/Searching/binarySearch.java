package Java.Searching;

//Works only for sorted array
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Target < arr[mid]) {
                end = mid - 1;
            } else if (Target > arr[mid]) {
                start = mid + 1;
            } else {
                Target = mid;
            }
        }
        System.out.print("Target element is: "+ Target);
    }
}
