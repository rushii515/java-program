package Practice;

import java.util.Scanner;

public class pracetices1two {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" First subject MArks");
        int s1= sc.nextInt();

        System.out.println(" SEcond subject MArks");
        int s2= sc.nextInt();
        System.out.println("  Third subject MArks");
        int s3= sc.nextInt();

        int total= s1+s2+s3;
        double marks= (total/300.0)* 100;
        System.out.println(" Total MArks " + marks);

    }
}
