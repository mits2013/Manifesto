package com.manifesto.atm.entity;

/**
 * Bean for holding account details
 */
public class UserAccount {

    Integer accountNumber;
    Integer pin;
    Integer accountBalance;
    Integer overdraftAmount;

    public UserAccount(Integer accountNumber, Integer pin, Integer accountBalance, Integer overdraftAmount) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountBalance = accountBalance;
        this.overdraftAmount = overdraftAmount;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(Integer overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
}
