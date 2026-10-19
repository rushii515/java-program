package thirdday;

import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println(" Enter Any 1 to 3 number : ");
        int num = sc.nextInt();

        int computer = r.nextInt(3) + 1;

        System.out.println(" Your choice : " + num);
        System.out.println(" Computer choice : " + computer);


        if (num < 1 || num > 3) {
            System.out.println(" Invalid choice!");
        } else if (num == computer) {
            System.out.println("Match Draw !");

        } else if ((num == 1 && computer == 3) ||
                (num ==2 && computer==1) ||
                (num ==3 && computer==2)
        ) {
            System.out.println(" You Win!");
        }
        else {
            System.out.println("Computer Wins !");
        }
    }
}
