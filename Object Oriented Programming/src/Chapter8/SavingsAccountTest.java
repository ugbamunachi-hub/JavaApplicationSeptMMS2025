package Chapter8;


public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.printf("%-10s%-15s%-15s%n", "Month", "Saver 1 Bal", "Saver 2 Bal");
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("%-10d$%-14.2f$%-14.2f%n", month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("%nBalances after 1 month at 5%% interest:%n");
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
    }
}