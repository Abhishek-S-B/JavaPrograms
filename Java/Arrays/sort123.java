package Java.Arrays;

import java.util.*;

//3 2 2 1 3 sort this at O(n) time complexity and O(1) space complexity
public class sort123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count1 = 0, count2 = 0, count3=0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                count1++;
            }else if(arr[i] == 2) {
                count2++;
            }else {
                count3++;
            }
        }
        for(int i = 0; i < count1; i++) {
            arr[i] = 1;
        }
        for(int i = count1; i < count1+count2; i++) {
            arr[i] = 2;
        }
        for(int i = count2+count1; i < count1+count2+count3; i++) {
            arr[i] = 3;
        }
        for(int a: arr)
            System.out.print(a+" ");
    }
}
