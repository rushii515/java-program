
class InvalidInputException extends Exception{
  @Override
    public String toString(){
        return " Cannot add 8 and 9";
    }

    @Override
    public String getMessage(){
      return " I am getMessage()";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return " Cannot divide by zero ";
    }

    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}

class MaxAgeException extends Exception{

    @Override
    public String toString(){
        return "Input cant be greater than 10000 ";
    }

    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception{

    @Override
    public String toString(){
        return "Input cant be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}


class CustomCalculator {
    double add( double a, double b )  throws InvalidInputException, MaxAgeException,MaxMultiplyInputException{

        if(a>10000 || b>10000){
            throw new MaxAgeException();
        }else if( a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        if(a==9 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }


    double sub( double a, double b ) throws InvalidInputException, MaxAgeException,MaxMultiplyInputException{

        if(a>10000 || b>10000){
            throw new MaxAgeException();
        }else if( a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        if(a==9 || b==9){
            throw new InvalidInputException();
        }
        return a-b;
    }


    double mul( double a, double b )throws InvalidInputException, MaxAgeException, MaxMultiplyInputException{

        if(a>10000 || b>10000){
            throw new MaxAgeException();
        }else if( a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        if(a==9 || b==9){
            throw new InvalidInputException();
        }
        return a*b;
    }


    double div( double a, double b ) throws InvalidInputException, MaxAgeException,CannotDivideByZeroException{
        if(a==0 || b==0){
            throw new CannotDivideByZeroException();
        }

        if(a>10000 || b>10000){
            throw new MaxAgeException();
        }
        if(a==9 || b==9){
            throw new InvalidInputException();
        }
        return a/b;
    }




}



public class Calculater {

    static void main(String[] args) throws InvalidInputException , CannotDivideByZeroException,MaxAgeException,MaxMultiplyInputException {
        CustomCalculator c= new CustomCalculator();
        c.add(8,9);
        c.div(600000,40);


    }
}
