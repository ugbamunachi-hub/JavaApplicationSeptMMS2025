package Chapter8;


import Chapter8.Time2;

public class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        if (balance >= 0.0) {
            this.savingsBalance = balance;
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0.0) {
            annualInterestRate = newRate;
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
