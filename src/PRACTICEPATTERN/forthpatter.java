package PRACTICEPATTERN;

public class forthpatter {
    static void main(String[] args) {
        for (int i=4; i>=1; i--){
// inner loop
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println( );
    }
}
