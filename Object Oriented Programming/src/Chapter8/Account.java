/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

 import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;
        if (balance.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = balance;
        } else {
            this.balance = BigDecimal.ZERO;
        }
    }

    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(depositAmount);
        }
    }

    public void withdraw(BigDecimal withdrawAmount) {
        if (withdrawAmount.compareTo(balance) <= 0) {
            balance = balance.subtract(withdrawAmount);
        } else {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}