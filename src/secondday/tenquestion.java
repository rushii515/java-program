package secondday;

abstract class Animal{
    void sleep(){
        System.out.println(" Animal is sleep..");
    }

    abstract void sound();
}

interface Pet{
    void play();
}

class Dog extends Animal implements Pet{
   public void sleep(){
        System.out.println(" Dog is Sleep..");
    }
    void sound(){
        System.out.println("Dog sound bhooo bhooo");
    }
    @Override
    public void play() {
        System.out.println(" dog is playing");
    }
}
public class tenquestion {
    static void main(String[] args) {
        Dog d= new Dog();
        d.sleep();
        d.sound();
        d.play();
    }
}
