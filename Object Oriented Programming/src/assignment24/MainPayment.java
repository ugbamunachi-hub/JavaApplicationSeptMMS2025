/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment24;


public class MainPayment {
    public static void main(String[] args){
   CreditCard creditcard = new CreditCard();
   MobileWallet mobilewallet = new MobileWallet();
   BankTransfer banktransfer = new BankTransfer();
   
   creditcard.pay(5000);
   mobilewallet.pay(2300);
   banktransfer.pay(3039);
   
    }
}
