
package bankingsystemapp;

public class CurrentAccount extends BankAccount  {

    public CurrentAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }
    @Override
void deposit(double amount){
if (amount > 0) {
    double newBalance = (balance + amount);
            balance += amount;
            System.out.println("Deposited Amount: $" + amount);
            System.out.println("Deposited  New Balance Amount: $" + newBalance);

        } else {
            System.out.println("Deposit amount must be positive.");
        }
}
    
    @Override
    void withdraw(double amount) {
            double newBalance = (balance - amount);
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
              System.out.println("New Withdrawn Amount: " + newBalance);

        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    @Override
    void calculateInterest() {
        System.out.println("Current accounts do not earn interest.Byeeee");
                }
  
 void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Currentt Balance: $" + balance);
    }

   
    }

   


