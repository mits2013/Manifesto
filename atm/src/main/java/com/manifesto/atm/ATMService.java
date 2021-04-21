package com.manifesto.atm;

/**
 * ATM Interface listing all supported operations which needs to be implemented.
 */
public interface ATMService {

    /**
     * Retrieve account balance
     * @param accountNumber
     * @param pin
     * @return
     */
    public String getAccountBalance(String accountNumber,String pin);

    /**
     * Process withdrawal of fund from user account
     * @param accountNumber
     * @param enteredPin
     * @param withdrawAmount
     * @return
     */
    public String withdrawal(String accountNumber,String enteredPin,String withdrawAmount);

}
