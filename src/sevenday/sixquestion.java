package sevenday;

abstract class shape{
    void calculateArea(){
//        abstract class be a used..
        System.out.println(" Circle Area finout");
    }
}
class Circle extends shape{
    void calculateArea(){
        int radius=34;
        System.out.println(" Circle Area : "+Math.PI*radius*radius);
    }
}

public class sixquestion {
    static void main(String[] args) {
        Circle c= new Circle();
        c.calculateArea();
    }
}
