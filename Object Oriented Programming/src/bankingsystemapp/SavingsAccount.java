
package bankingsystemapp;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
   void deposit(double amount){
       double newBalance =(balance + amount);
if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: $" + amount);
              System.out.println("Deposited New Balance: $" + newBalance);

        } else {
            System.out.println("Deposit amount must be positive.");
        }
}
   
public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Savings Account Balance: $" + balance);
    }

@Override
    public void withdraw(double amount) {
       double newBalance =(balance - amount);

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: $" + amount);
             System.out.println(" New Withdrawn Amount: " + newBalance);

        } else {
            System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
        }
    }

    

    @Override
    void calculateInterest() {
double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest calculated and added: $" + interest);

    }
}
