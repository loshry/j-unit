package com.company;

public class BankAccount {

    double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public double deposit (double deposit){
        if (deposit <= 0) {
            System.out.println("Deposit must be positive number");
        }else
        balance = deposit + balance;
        return balance;
    }

    public double withdrawal (double withdrawal) {
        if (withdrawal < balance){
            balance = balance - withdrawal;

        }else
            System.out.println("Insufficient funds");
        return balance;
    }
}
