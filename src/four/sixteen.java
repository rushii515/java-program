package four;

import java.util.Scanner;

public class sixteen {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter array size: ");
        int n= sc.nextInt();

        int[] arr= new int[n];

        System.out.println(" Enter array elements: ");

        for( int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1] ){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }

            }
        }
        System.out.println(" Ascending Order: ");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");

        }

    }
}
