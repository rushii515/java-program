package sevenday;

abstract class Vehicle{
    void start(){
        System.out.println(" Vehicle are Starting....");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println(" Car on road...");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println(" Bike is Stating...");
    }
}
public class sevenquestion {
    static void main(String[] args) {
        Car c= new Car();
        c.start();

        Bike b= new Bike();
        b.start();
    }
}
