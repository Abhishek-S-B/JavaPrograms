package Java.Hashing;

import java.util.*;
import java.lang.*;
import java.io.*;

public class oddEvenPrblm
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countX = 0, countY = 0, sum = 0;
        int[] freq = new int[27];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int a = ch - 96;

            freq[a]++;

        }
        for(int i = 0; i < 27; i++) {
            if(freq[i] > 0){
                if( freq[i] % 2 == 0 && i % 2 == 0 ) {
                    countX++;
                }
                if(freq[i] % 2 != 0 && i % 2 != 0){
                    countY++;
                }
            }
        }
        sum = countX + countY;
        if(sum % 2 == 0)
            System.out.print("EVEN");
        else
            System.out.print("ODD");
    }
}