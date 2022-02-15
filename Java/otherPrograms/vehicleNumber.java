package Java.otherPrograms;

import java.util.*;
import java.lang.*;
public class vehicleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberPlate = sc.nextLine();
        int numTimes = sc.nextInt();
        String numberString = numberPlate.substring(5);
        int intPlate = Integer.parseInt(numberString);
        for(int i = 0; i < numTimes; i++){
            if(intPlate == 99999){
                intPlate = 0;
            }
            intPlate++;
            String addZero = String.valueOf(intPlate);
            while(addZero.length() < 5)
                addZero = "0" + addZero;
            System.out.println(numberPlate.substring( 0, 5 ) + addZero);
        }
    }
}
