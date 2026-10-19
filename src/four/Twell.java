package four;

import java.util.Scanner;

public class Twell {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the first number: ");
        int a= sc.nextInt();

        System.out.println(" Enter the second number:");
        int b= sc.nextInt();

        int Gbc= 1;

        int min= (a<b)?a:b;

        for (int i=1; i<= min; i++){
            if( a% i==0 && b%i ==0){
                Gbc=i;
            }

        }
        System.out.println(" GBC Number : "+Gbc);
    }
}
