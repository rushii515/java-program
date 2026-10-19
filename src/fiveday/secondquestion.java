package fiveday;

public class secondquestion {

    private double balance = 1000;

    void deposite(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(" Deposit successful");
        } else {
            System.out.println(" Invalid amount");
        }
    }
        void withdraw(double amount){
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                System.out.println(" Withdrawal successul");
            } else {
                System.out.println(" Insufficient balance or invalid amount");
            }

        }

        void displayBalance() {
            System.out.println(" Balance : " + balance);
        }

    static void main(String[] args) {
        secondquestion b= new secondquestion();
        b.displayBalance();
        b.deposite(500);
        b.withdraw(200);
        b.displayBalance();
    }
}

