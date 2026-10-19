package four;

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the String");
         String s= sc.nextLine();

         int vowels=0;
         int consonants=0;

         for(int i=0; i<s.length(); i++){
             char ch= Character.toLowerCase(s.charAt(i));
             if (ch =='a' || ch =='e' || ch =='i' ||
                     ch =='o' ||  ch =='u'   ){
                 vowels++;

             }
             else if ( ch >='a' && ch<='z'){
                 consonants++;
             }
         }
        System.out.println(" Vowels" +vowels);
        System.out.println(" Consonants: " +consonants);


    }
}
