package sixday;

class Base{
    void show(){
        System.out.println(" This is  Base class");
    }
}

class Drived extends Base{
    void disply(){
        System.out.println(" This is Derived class");
    }
}
public class fivequestion {
    static void main(String[] args) {
        Drived d= new Drived();
        d.show();
        d.disply();
    }
}
