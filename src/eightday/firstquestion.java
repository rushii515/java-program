package eightday;

import java.util.Scanner;

public class firstquestion {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("First number: ");
        int first= sc.nextInt();

        System.out.println(" Second number: ");
        int second= sc.nextInt();

       if(first !=second){
           System.out.println(" Number is not equal");
       }else {
           System.out.println(" number is equal" );
       }

    }
}
