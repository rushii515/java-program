package eightday;

import java.util.Scanner;

public class eightquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Student the Grade : ");
        String grade= sc.next();

        switch (grade){

            case "A":
                System.out.println(" Excellent.");
                break;

            case "B":
                System.out.println("Very Good.");
                break;

            case "C":
                System.out.println("Good.");
                break;

            case "D":
                System.out.println(" Needs Improvement.");
                break;


            default:
                System.out.println("Invalid Grade.");
        }

    }
}
