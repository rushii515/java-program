package eightday;

import java.util.Scanner;

public class thirdeenquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the number: ");
        int a= sc.nextInt();

        int count=0;
        while (a>0){

            count++;
            a= a/10;



        }

        System.out.println(" Total Digits : "+count);
    }
}
