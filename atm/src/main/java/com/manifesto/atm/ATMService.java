package com.manifesto.atm;

/**
 * ATM Interface listing all supported operations which needs to be implemented.
 */
public interface ATMService {

    /**
     * Retrieve account balance
     * @param accountNumber
     * @return
     */
    public Integer getAccountBalance(int accountNumber);

    /**
     * Process withdrawal of fund from user account
     * @param accountNumber
     * @return
     */
    public Integer withdrawal(int accountNumber,int originalPin, int enteredPin);

}
