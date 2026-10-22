package eightday;

import java.util.Scanner;

public class Tenquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int a= sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(i + " * " +a  +" =" +(i*a));
        }
    }
}
