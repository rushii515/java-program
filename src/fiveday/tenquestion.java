
package fiveday;

class SubAnimal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends SubAnimal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends SubAnimal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class tenquestion {
    public static void main(String[] args) {
        SubAnimal a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}
