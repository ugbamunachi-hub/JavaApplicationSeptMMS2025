
package assignment24;


public class BankTransfer implements Payment {
  @Override
  public void pay(double amount){
       System.out.println("Paid "+amount+ " using Bank Transfer\n");

     }
}
