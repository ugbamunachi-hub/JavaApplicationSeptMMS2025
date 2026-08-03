
package encapsulation;

public class MainEncapsulation {
    public static void main(String[] args){
        String mom = null;
    BankAccount bankaccount = new BankAccount( 1234543234,mom,12345);
    bankaccount.deposit(23);
    bankaccount.withdraw(21);
    bankaccount.displayaccountDetails();
    }
}