package com.manifesto.atm.entity;

/**
 * Bean for holding account details
 */
public class UserAccount {

    String accountNumber;
    String pin;
    String accountBalance;
    String overdraftAmount;

    public UserAccount(String accountNumber, String pin, String accountBalance, String overdraftAmount) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountBalance = accountBalance;
        this.overdraftAmount = overdraftAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(String overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
}
