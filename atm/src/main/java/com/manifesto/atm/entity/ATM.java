package com.manifesto.atm.entity;

/**
 * Represent ATM entity
 */
public class ATM {

    int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ATM(int balance) {
        this.balance = balance;
    }

    /**
     *
     * @param balanceWithdrawn
     */
    public void updateBalanceOnWithdrawal(int balanceWithdrawn){
        this.balance= balance-balanceWithdrawn;
    }

}
