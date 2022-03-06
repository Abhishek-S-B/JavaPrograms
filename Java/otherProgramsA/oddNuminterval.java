package Java.otherProgramsA;

import java.util.Scanner;

public class oddNuminterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.print(oddInterval(low, high));
    }
    public static int oddInterval(int low, int high) {
        int val = high - low + 1;
        if(low % 2 != 0 && high % 2 != 0)
            val++;
        return val/2;
    }
}

