
package bankingsystemapp;


public abstract class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void deposit(double amount){
           System.out.print("What amount do you want to deposit");

    }

   
    void displaybalance(){
            System.out.print("Displaing balance");

    }
    abstract void withdraw(double amount);
    
        abstract void calculateInterest();
}