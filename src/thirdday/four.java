package thirdday;

import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter the marks ");
        int marks= sc.nextInt();

        if(marks>= 35){
            System.out.println(" Student is Pass");
        }else{
            System.out.println(" student is Fail");
        }
    }
}
