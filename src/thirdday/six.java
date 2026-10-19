package thirdday;

import java.util.Scanner;

public class six {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first number: ");
        int first= sc.nextInt();

        System.out.println("enter the first number: ");
        int second= sc.nextInt();

        System.out.println("enter the first number: ");
        int third= sc.nextInt();

        if(first>=second && first>=third){
            System.out.println( first + " larger number");
        } else if (second >=first && second>=third) {
            System.out.println( second+ " larger number");

        }else {
            System.out.println(third + " larger number");

        }
    }
}
