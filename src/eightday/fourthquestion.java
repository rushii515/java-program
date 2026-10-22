package eightday;

import javax.script.ScriptContext;
import java.util.Scanner;

public class fourthquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the first number: ");
        int a= sc.nextInt();
        System.out.println(" Enter the second number: ");
        int b= sc.nextInt();

        System.out.println(" User choice that Operater : ");
        String Operater= sc.next();

        switch (Operater){
            case "add":
                System.out.println(" Addition: "+ (a+b));
                break;

            case "sub":
                System.out.println(" Substraction"+ (a-b));
                break;
            case "mul":
                System.out.println("Multiplication "+ (a*b));
                break;
            case "div":
                System.out.println("division "+ (a/b));
                break;
            case "Modules":
                System.out.println(" Addition"+ (a%b));
                break;

            default:
                System.out.println(" Sorry next chanage for you");

            }
        }

    }

