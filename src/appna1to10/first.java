package appna1to10;

import java.util.Scanner;

public class first {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the first number: ");
        int first = sc.nextInt();

        System.out.println(" Enter the second number: ");
        int second = sc.nextInt();

        System.out.println(" Select the Operator : ");
        String Operator= sc.next();

        switch (Operator){
            case "add":
                int add= first+second;
                System.out.println( "Adding : "+add);
                break;

            case "sub":
                int sub= first-second;
                System.out.println(" Sub:  " +sub);
                break;

            case "mul":
                int mul= first*second;
                System.out.println(" Mul : " +mul);
                break;

            case "div":
                int div= first/second;
                System.out.println(" Div : "+ div);
                break;

            default:
                System.out.println(" No having Operator");
        }
    }
}
