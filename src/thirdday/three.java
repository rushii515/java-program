package thirdday;

import java.util.Scanner;

public class three {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter the number: ");
        int num= sc.nextInt();

       if(num>100){
           System.out.println(" number is greater than 100");

       }else{
           System.out.println(" number is less than 100");
       }
    }
}
