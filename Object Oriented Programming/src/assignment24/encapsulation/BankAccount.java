package assignment24.encapsulation;

public class BankAccount {

      private String accountHolder;
 private int accountNumber;
    private double balance;

    public BankAccount( String accountHolder, int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        double newBalance = (balance + amount);
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: $" + amount);
            System.out.println("Deposited New Balance: $" + newBalance);

        } else {
            System.out.println("Deposit amount must be positive.");

        }
    
    }
    public void withdraw(double amount) {
        double newBalance = (balance - amount);

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: $" + amount);
            System.out.println("New Withdrawn Amount: " + newBalance);

        } else {
            System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
        }
    }

    public void displayaccountDetails() {
        System.out.println("Account Balance " + balance);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
        

    }

