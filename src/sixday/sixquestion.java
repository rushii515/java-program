package sixday;

class Parent{
     String name= "Rushya";

//     void disply(){
//         System.out.println(" Parenet Name : "+name);
//     }
}
class child extends Parent{
    String name=" Asif";

    void show(){
        System.out.println(" Child name : " +this.name);
        System.out.println("Parent name : "+super.name);
    }
}

public class sixquestion {
    static void main(String[] args) {
        child c= new child();
        c.show();

    }
}
