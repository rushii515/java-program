package fourthday;

public class secondquestion {

    int length= 3;
    int breath= 4;

    void area(){
        System.out.println(" Rectange  area is : "+(length+breath));
    }

    void parameter(){
        System.out.println( " Rectange parameter: " +(2*(length+breath)));
    }


    static void main(String[] args) {
        secondquestion s= new secondquestion();
        s.area();
        s.parameter();
    }
}
