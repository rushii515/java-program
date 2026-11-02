package appna1to10;

import java.util.Scanner;

public class second {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int n= sc.nextInt();

        if(n>0){
            System.out.println("number is positive " +n);
        }else if (n<0){
            System.out.println(" Number is Negative "+n);
        }else {
            System.out.println(" NUmberr is Zero " +n);
        }

        if(n%2==0){
            System.out.println(" number is odd : " +n);

        }else {
            System.out.println(" number is even : " +n);
        }

        if(n%5==0){
            System.out.println(" Dive only 5: " +n);
        }else {
            System.out.println(" No dive in 5 "+ n);
        }
        
    }
}
