package appna1to10;

import java.util.Scanner;

public class Thirdquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the first number : ");
        int n1= sc.nextInt();

        System.out.println(" Enter the second number : ");
        int n2= sc.nextInt();

        System.out.println(" Enter the third number : ");
        int n3= sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println(" n1 is largest number "+n1);
        } else if(n2>n1 && n2>n3) {
            System.out.println(" n2 largest number : "+n2);
        } else if(n3>n1 && n3>n2) {
            System.out.println(" n3 is largest number : "+n3);

        }else{
            System.out.println(" sub number is equal");
        }


    }
}
