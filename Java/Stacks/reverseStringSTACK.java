package Java.Stacks;

import java.util.*;
import java.lang.*;
import java.io.*;

public class reverseStringSTACK
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine());
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            s.push(ch);
        }

        /*
         String str = sc.nextLine();
      Stack<Character> s = new Stack<>();
      for(int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        s.push(ch);
      }

      String rev = "";
     while(!s.isEmpty()) {
        rev = rev + s.pop();
     }
        System.out.print(rev);
         */
        for (int i = 0; i < str.length(); i++)
        {
            char ch = s.pop();
            str.setCharAt(i,ch);
        }
        System.out.print(str);
    }
}
