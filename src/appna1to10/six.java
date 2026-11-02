package appna1to10;

import java.util.Scanner;


public class six {

        static boolean isPrima(int n){
            if(n<=1){
                return false;

            }

            for(int i=2; i<n; i++){

                if(n%i==0){
                    return false;
                }

            }
            return true;

        }



   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the Number : ");
        int n= sc.nextInt();

        if(six.isPrima(n)){
            System.out.println(" Prime Number ");

        }else {
            System.out.println(" Not a Prime nunber");
        }

    }
}
