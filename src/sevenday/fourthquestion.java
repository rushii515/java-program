package sevenday;
class Animals {
    void sound() {
        System.out.println(" Animal sound...");
    }
}
    class Dog extends Animals {
        void sound(){
            System.out.println(" Dog Sound Bhooo Bhoo....");
        }
    }


public class fourthquestion {
    static void main(String[] args) {
     Dog d= new Dog();
     d.sound();

    }
}
