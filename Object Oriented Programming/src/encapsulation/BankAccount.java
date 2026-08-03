package encapsulation;


public class BankAccount {
    private int accountNumber;
   private String accountHolder;
     private double balance = 1234567890 ;

    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

  /*  BankAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

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
    public void deposit(double balance){
        System.out.println("How much do you want to deposit ?" );
        balance = balance + balance;
    }
    public void withdraw( double balance){
        System.out.println("How much do you want to withdraw ?" );
        balance = balance - balance;
    }
public void displayaccountDetails(){
        System.out.println("Account Balnace "+balance );

}
}

