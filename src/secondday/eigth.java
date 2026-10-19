package secondday;

import java.util.Scanner;

public class eigth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the String: ");
        String first= sc.nextLine();

        String upper = first.toUpperCase();
        String lowercase=  first.toLowerCase();

        System.out.println(" Uppercase : "+upper);
        System.out.println(" Lowercase= " + lowercase);




    }
}
