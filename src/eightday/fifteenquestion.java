package eightday;

import java.util.Scanner;

public class fifteenquestion {
  static void  displayMessage(){
        System.out.println(" Squearing");
    }
   static int square( int a){
        int sq= a*a;
        return sq;
    }





    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter first number : ");
        int a= sc.nextInt();

        int result= fifteenquestion.square(a);



            fifteenquestion.displayMessage();

        System.out.println( " Square : "+result);




    }
}
