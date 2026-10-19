package fourthday;

public class eightquestion {

    int  add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return a - b ;
    }

    int multiply(int a, int b){
        return a*b;

    }

    double divide(int a, int b){
        return (double) a/b;

    }


    static void main(String[] args) {
      eightquestion e= new eightquestion();

        System.out.println( " addition " +  e.add(23,45) );
        System.out.println( " substaction " + e.subtract(23,45) );
        System.out.println(  " multiplay " +e.multiply(23,45) );
        System.out.println( " Divide" + e.divide(23,45) );


    }

}
