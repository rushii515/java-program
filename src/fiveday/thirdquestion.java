package fiveday;


    class Vehicle {
        void display() {
            System.out.println(" Vehicle for start");
        }
    }

    class car extends Vehicle {
        void drive() {
            System.out.println(" Car for road travel");
        }
    }

        public class thirdquestion {
    static void main(String[] args) {
    car c= new car();
    c.drive();
    c.display();

    }
}
