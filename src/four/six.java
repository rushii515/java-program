package four;

import java.util.Scanner;

public class six {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the Number: ");
        int num= sc.nextInt();
        int rever=0;

        while(num!=0){
            int digit = num%10;
           rever= rever *10 + digit;
           num= num / 10;

        }
        System.out.println( "reverse number:" +rever);
    }
}
