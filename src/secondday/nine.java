package secondday;

import javax.xml.transform.Result;
import java.util.Scanner;

public class nine {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the name : ");
        String name= sc.nextLine();

        String result= name.replace(" " , "_");
        System.out.println("Result " +result);
    }
}
