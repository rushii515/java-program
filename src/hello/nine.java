package hello;

import java.util.Scanner;

public class nine {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println( "enter your name:");
        String name= sc.nextLine();

        System.out.println(" enter your age:");
        int age= sc.nextInt();
        sc.nextLine();

        System.out.println(" enter your city:");
        String city= sc.nextLine();

        System.out.println(" Enter your college:");
        String college = sc.nextLine();

        System.out.println(" Enter your branch:");
        String branch=  sc.nextLine();


        System.out.println(" Your intoduction ");

        System.out.println( "my name is: "+name+  " my age: "+age+ " me live his city " +city+ "and my college is " +college+ " and me addition having his additionn his branch "+ branch);

    }
}
