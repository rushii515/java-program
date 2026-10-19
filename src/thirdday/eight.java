package thirdday;

import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter the first number");
        int first= sc.nextInt();

        System.out.println(" enter the second number");
        int second= sc.nextInt();

        System.out.println(" Enter the choice : ");
        int choice= sc.nextInt();

        System.out.println(" The first number : "+first);
        System.out.println(" The second number : " +second);

        switch (choice){
            case 1:
                System.out.println( first + second);
                break;

            case 2:
                System.out.println( first - second);
                break;

            case 3:
                System.out.println(first  *second);
                break;

            case 4:
                System.out.println(first / second);
                break;
        }

    }
}
