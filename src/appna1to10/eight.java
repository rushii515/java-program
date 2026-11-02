package appna1to10;

import java.util.Scanner;

public class eight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {12, 23, 21, 34, 12};

        System.out.println("Enter the number to search:");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number is not found");
        }

    }
}