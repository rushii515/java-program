package eightday;

import java.util.Scanner;

public class secondquestion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input no. positive and Negative number: ");
        int a = sc.nextInt();

        System.out.println( (a > 0) ? " Positive" : "NEgative ");

    }
}