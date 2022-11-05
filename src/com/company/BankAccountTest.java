package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    public BankAccount account;

    @BeforeEach
    void setUp(){
        account = new BankAccount();

    }

    @Test
    @DisplayName("Deposit $100 for balance of $125")

    void deposit_ValidInput_CorrectAnswer() {
        account.setBalance(25);
        account.deposit(100);
        double result = account.getBalance();
        assertEquals(125, result);
    }

    @Test
    @DisplayName("Withdraw $100 for balance of $125")

    void withdraw_ValidInput_CorrectAnswer(){
        account.setBalance(225);
        account.withdrawal(100);
        double result = account.getBalance();
        assertEquals(125, result);
    }

    @Test
    @DisplayName("Insufficient funds")

    void withdraw_InvalidInput_ErrorMessage(){
        account.setBalance(0);
        account.withdrawal(100);
        double result = account.getBalance();
        assertEquals("Insufficient Funds", result);
    }
}
