package fourthday;

public class thirdquestion {

    String brand;
    int price;

    void car1(){
        System.out.println( brand  + " " +price+ " ");
    }

    void car2(){
        System.out.println( brand +  "  " + price + " ");
    }

    static void main(String[] args) {
        thirdquestion c1= new thirdquestion();
        c1.brand= "BMW";
        c1.price=4200000;

        thirdquestion c2= new thirdquestion();
        c2.brand="TATA";
        c2.price=500000;

        c1.car1();
        c2.car2();

    }

}
