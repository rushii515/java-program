package Practice;

import java.util.Scanner;

public class second {

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the Math marks : ");
        int m1= sc.nextInt();

        System.out.println(" Enter the Physic  marks : ");
        int p1= sc.nextInt();

        System.out.println(" Enter the Java marks : ");
        int java= sc.nextInt();

        int total= m1+p1+java;
     double marks= (total/300.0)*100;

        System.out.println(" Total marks "+total);
        System.out.println(" Percentage "+marks + "%");

        if(marks>40){
            System.out.println(" Pass");
        }else {
            System.out.println(" Fail");
        }
    }
}
