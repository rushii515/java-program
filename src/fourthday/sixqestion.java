package fourthday;

public class sixqestion {
    String accoundholder= " Adity";
    double balance=1000;

    void deposit( double amount){
         balance= balance + amount;
    }

    void displyBalance(){
        System.out.println(" Name : " +accoundholder);
        System.out.println("Balance : " +balance);

    }

    static void main(String[] args) {
        sixqestion b= new sixqestion();
        b.deposit(4000);
        b.displyBalance();
    }
}
