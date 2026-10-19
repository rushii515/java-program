package fiveday;

class Person{
   String name;
   int age;

   Person(String name, int age){
       this.name= name;
       this.age=age;
   }
}

class Student extends Person{
    int rollnumber;

    Student(String name, int age, int rollnumber){
        super(name, age);
        this.rollnumber=rollnumber;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " +rollnumber);
    }
}

public class ninequestion {
    static void main(String[] args) {
        Student s= new Student("Rushikesh", 21,234);
        s.display();
    }
}
