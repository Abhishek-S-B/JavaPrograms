package Java.otherProgramsA;

import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        System.out.print(reverse(x));
    }
    public static int reverse(int x) {

            long remainder = 0;
            long copyX = x;
            long sum = 0;
            if(x < 0)
                x = Math.abs(x);
            while(x > 0){
                remainder = x % 10;
                sum = sum * 10 + remainder;
                x = x / 10;
            }
            if(sum > -2147483648 && sum < 2147483647){
                if(copyX < 0)
                    return (int)-sum;
                else
                    return (int)sum;
            }
            else
                return 0;
    }
}
