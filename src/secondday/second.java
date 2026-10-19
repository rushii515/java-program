package secondday;

import java.util.Scanner;

public class second {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first number: ");
        int a= sc.nextInt();

        System.out.println("enter the seond number:");
        int b= sc.nextInt();

        int sum= a+b;
        int different= a-b;
        int product= a*b;

        int quotient= a/b;
        int remainder= a%b;

        System.out.println( "Addiontion:" +sum);
        System.out.println(" Difference : " +different);
        System.out.println(" Product"+ product);
        System.out.println(" quotient " +quotient);
        System.out.println(" remainder: " + remainder);
    }
}
