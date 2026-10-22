package eightday;

import java.util.Scanner;

public class thirdquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Input First number: ");
        int first= sc.nextInt();

        System.out.println(" Input Second number: ");
        int second= sc.nextInt();

        System.out.println( (first>second)?" first number :"+first: " second number" +second);
    }
}
