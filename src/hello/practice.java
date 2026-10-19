package hello;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the subject1");
        int s1= sc.nextInt();

        System.out.println(" Enter the subject2");
        int s2= sc.nextInt();


        System.out.println(" Enter the subject3");
        int s3= sc.nextInt();

        System.out.println(" Enter the subject4");
        int s4= sc.nextInt();


        System.out.println(" Enter the subject5");
        int s5= sc.nextInt();

        int total= s1+s2+s3+s4+s5;
        double percentage= (total/500.0)*100;
        System.out.println(" Total Marks= " +total);
        System.out.println("Your percentage is : " +percentage+ "%");


    }
}
