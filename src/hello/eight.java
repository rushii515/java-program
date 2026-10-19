package hello;

import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter Employe name:");
        String name= sc.nextLine();

        System.out.println(" Enter Employe ID : ");
        int ID= sc.nextInt();

        System.out.println("enter Employe Salary");
        int Salary= sc.nextInt();


        System.out.println("Employe Details:- ");

        System.out.println(" Employe name is " +name+ " and Employe ID " +ID+ " Salary "+Salary);
    }
}
