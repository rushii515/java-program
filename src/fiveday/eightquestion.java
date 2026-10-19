package fiveday;


interface  Payment{
    void pay();
}
class UPIpayment implements  Payment{

   public void pay(){
        System.out.println(" Payment done using UPI");
    }
}

class CardPayment implements Payment{
  public   void pay(){
      System.out.println(" Payment done for Card");
    }
}
public class eightquestion {
    public static void main(String[] args) {
        UPIpayment u = new UPIpayment();
        u.pay();
        CardPayment c = new CardPayment();
        c.pay();
    }
}
