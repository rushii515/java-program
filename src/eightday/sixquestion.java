package eightday;

import java.util.Scanner;

public class sixquestion {
    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println(" Customer Selected menu:  ");
        String menu= sc.next();

        switch (menu){
            case "Tea":
                System.out.println(" Serve Tea...");
                System.out.println(" Price :10");
                break;

            case "Coffee":
                System.out.println(" Serve Coffee...");
                System.out.println(" Price :20");
                break;
            case "Juice ":
                System.out.println(" Serve Juice...");
                System.out.println(" Price :30");
                break;

            default:
                System.out.println(" No order ");
        }


    }
}
