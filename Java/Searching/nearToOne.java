package Java.Searching;

import java.util.Scanner;
// 1 0 0 0 2 2 2 bcz 2 is found after 4 places
// count =  4
public class nearToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                index = i;
            }
        }
        int Cforwar = 0;
        int Creverse = 0, flagfor = 0, flagrev= 0;
        for(int i = index; i < n; i++){
            if(arr[i] != 2) {
                Cforwar++;
                flagfor = 1;
            }else {
                break;
            }
        }
        for(int i = index; i > 0 ; i--){
            if(arr[i] != 2) {
                Creverse++;
                flagrev = 1;
            }else {
                break;
            }
        }

        if(flagfor == 1 && flagrev != 1) {
            int res = Cforwar;
            System.out.print(res);
        }else if(flagfor != 1 && flagrev == 1){
            int res = Creverse;
            System.out.print(res);
        }else if (flagfor == 1 && flagrev == 1) {
            int res = Math.min(Cforwar, Creverse);
            System.out.print(res);
        }

    }
}
