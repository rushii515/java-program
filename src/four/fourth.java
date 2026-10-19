package four;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args){
        int[] arr= { 23,12,34,12};
        int sum=0;

        for(int i=0; i<arr.length; i++){
             sum = sum+arr[i];


        }
        double average = (double) sum/arr.length;
        System.out.println(" Sum " +sum);
        System.out.println(" Average of : " +average);


    }
}
