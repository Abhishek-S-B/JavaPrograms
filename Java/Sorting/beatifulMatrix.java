package Java.Sorting;

import java.util.*;
public class beatifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                if(arr[i][j] == 1){
                    if(i > 3 && j > 3){
                        i = i - 1;
                        j = j - 1;
                    } else {
                        i = i + 1;
                        j = j + 1;
                    }
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
