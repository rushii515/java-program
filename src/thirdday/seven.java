package thirdday;

import java.util.Scanner;

public class seven {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the year : ");
        int year= sc.nextInt();

        if(year % 400==0){
            System.out.println("Leap year");
        } else if (year %100==0) {
            System.out.println(" No  leap year");

        }else if( year %4==0){
            System.out.println(" This is leap year");
        }
        else {
            System.out.println(" This is not leap year");
        }

    }
}
