package fiveday;

class Animal {
    void animals() {
        System.out.println("Animals sound : ");
    }
}
class dog extends Animal {
    void dog() {
        System.out.println("Bhooo Bhoooo");
    }
}

class cast extends Animal{
    void cat(){
        System.out.println(" MAv mav mav");
    }
}
public class fourthquestion {
    static void main(String[] args) {
        dog d= new dog();
        cast c= new cast();
        d.dog();
        c.cat();
    }

}
