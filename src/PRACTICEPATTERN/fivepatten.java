package PRACTICEPATTERN;

public class fivepatten {
    static void main(String[] args) {
//        outer loop
        int n=4;
        for(int i=1; i<=n; i++){
//             inner loop -> spaceprint
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
//            innner loop
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
