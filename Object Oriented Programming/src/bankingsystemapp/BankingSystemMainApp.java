/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingsystemapp;

/**
 *
 * @author HP USER
 */
public class BankingSystemMainApp {
    public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount("Munachi Ugba",907076789,1220000.0);
       CurrentAccount current = new CurrentAccount("Festus Olicha",10234449,982200.0);
        
       
       System.out.println("Savings Account ");
       System.out.println("=============================");
       
       savings.displayDetails();
       
                      System.out.println("\n");
   System.out.println("===========For deposit==================");
       savings.deposit(23);
            
                     System.out.println("\n");
         System.out.println("=========For Withdrawal====================");
       savings.withdraw(98777);
       
                      System.out.println("\n");
           System.out.println("=============================");
       savings.calculateInterest();
        
              System.out.println("\n");
        System.out.println("================================================");
               System.out.println("\n");

       System.out.println("Current Account ");
       System.out.println("================================");

      current.displayDetails();
                       
      System.out.println("\n");
      System.out.println("============For deposit=================");
        current.deposit(23);
           
               System.out.println("\n");
          System.out.println("==========For withdrawal===================");
        current.withdraw(2344);
             
               System.out.println("\n");
          System.out.println("=============================");
       current.calculateInterest();
}
}