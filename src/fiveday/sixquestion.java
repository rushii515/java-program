package fiveday;

public class sixquestion {

    int add( int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
    double add( double a, double b){
        return a+b;
    }

    static void main(String[] args) {
        sixquestion a= new sixquestion();
        System.out.println(" Addition " +a.add(23,21));
        System.out.println(" Addition " +a.add(12,36,45));
        System.out.println(" Addition " +a.add(25.1,34.4));

    }
}
