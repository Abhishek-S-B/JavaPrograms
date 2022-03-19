package Java.Searching;
import java.util.*;
import java.lang.*;
import java.io.*;

public class iceCreamParlour
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int trips = sc.nextInt();
        for(int i = 0; i < trips; i++) {
            int money = sc.nextInt();
            int size = sc.nextInt();
            int[] cost = new int[size];
            for(int j = 0; j < size; j++) {
                cost[j] = sc.nextInt();
            }
//            int[] ptrarr = twoPtr(cost, size, money);
//            Arrays.sort(ptrarr);
//            for(int p: ptrarr) {
//                System.out.print((p+1) + " ");
            int[] res = icecreamParlorA2(money, cost);
            System.out.print(res[0] + " " + res[1]);
            }
    }
//    static int[] twoPtr(int[] arr, int n, int m) {
//        int i = 0, j = i + 1;
//        while(i < j && j < n-1) {
//            if((arr[i] + arr[j]) == m) {
//                return new int[] {i, j};
//            }else {
//                j++;
//            }
//            i++;
//        }
//        return new int[] {0,0};
//    }
    static int[] icecreamParlorA2(int m, int[] arr) {
    int[] result = new int[2];
    int n = arr.length;
    int[] frequency = new int[100011];
    Arrays.fill(frequency, -1);
    for (int i = 0; i < n; i++) {
        int X = arr[i];
        int y = m - X;
        if (y >= 0) {
            int j = frequency[y];
            if (j != -1) {
                result[0] = j + 1;
                result[1] = i + 1;
                break;
            }
        }
            frequency[X] = i;
        }
        return result;
    }
}
