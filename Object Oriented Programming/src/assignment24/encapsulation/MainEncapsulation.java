package assignment24.encapsulation;

public class MainEncapsulation {

    public static void main(String[] args) {

        BankAccount bankaccount = new BankAccount("mom", 129345, 123234.0);

        System.out.println("For deposit");
        bankaccount.deposit(23);

        System.out.println("\n");
        System.out.println("========================");
        System.out.println("For withdraw");
        bankaccount.withdraw(21);

        System.out.println("\n");
        System.out.println("========================");
        System.out.println("For details");
        bankaccount.displayaccountDetails();
    }
}
