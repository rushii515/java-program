package sevenday;

interface  Payment{
    void makePayment();

}
class UPIPayment implements Payment{
    public void makePayment(){
        System.out.println(" Payment succesful trangesetation for UPi");
    }
}

class CardPayment implements Payment{
    public void makePayment(){
        System.out.println(" Payment give a Card ");
    }
}

public class ninequestion {
    static void main(String[] args) {
        UPIPayment u= new UPIPayment();
        u.makePayment();
        CardPayment car= new CardPayment();
        car.makePayment();
    }
}
