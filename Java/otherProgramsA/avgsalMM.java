package Java.otherProgramsA;

import java.util.Scanner;

public class avgsalMM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salary = new int[n];
        for(int i = 0; i < n; i++){
            salary[i] = sc.nextInt();
        }
        System.out.print(avgSalMaxMin(salary));
    }
    public static double avgSalMaxMin(int[] salary) {
        int max = salary[0], mini = salary[0], count = 0;
        for(int a: salary){
            if(max < a)
            max = a;
        }
        for(int a: salary){
            if(mini < a)
                mini = a;
        }
        double sum = 0;
        for (int j : salary) {

            if (j == max || j == mini)
                continue;
            count++;
            sum += j;
        }
        return max;
    }
}
