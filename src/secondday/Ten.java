package secondday;

import java.util.Scanner;

public class Ten {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter the String");
        String s= sc.nextLine();

        if(s.contains("  ")){
            System.out.println(" Space is double");
        }else {
            System.out.println(" single space");
        }
    }
}
