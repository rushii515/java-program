package hello;

import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter your name:");
        String name= sc.nextLine();

        System.out.println(" Enter Student age:");
        int age= sc.nextInt();

        System.out.println(" Enter Student roll number: ");
        int rollnumber= sc.nextInt();

        System.out.println(" Student name is " +name+  " age is " +age+ " roll number is : "+rollnumber);
    }
}
