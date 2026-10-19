package sixday;

class Vechicle{
    void start(){
        System.out.println(" Vechical is Starting" );
    }
}
class car extends Vechicle{
    @Override
    void start(){
        System.out.println(" Car is starting...");
    }
}

class Bike extends Vechicle{
    @Override
    void start(){
        System.out.println(" Bike is Starting...");
    }
}
public class eightquestion {
    static void main(String[] args) {
        car c= new car();
        c.start();
        Bike b= new Bike();
        b.start();
    }
}
