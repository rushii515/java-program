package hello;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);



        System.out.printf("enter first number:");
        int a= sc.nextInt();
        System.out.printf("enter first number:");
        int b= sc.nextInt();

        int add=a+b;

        System.out.println(add);
    }

}
