package sixday;

class parent {
    String name= " Rahul";

}
class Child extends parent{
    String name= " Sai";

    void disply(){
        System.out.println(   this.name);
        System.out.println( super.name);
    }
}
public class sevenquestion {
    static void main(String[] args) {


        Child c = new Child();
        c.disply();
    }
}
