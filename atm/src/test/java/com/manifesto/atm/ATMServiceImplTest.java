package com.manifesto.atm;

import com.manifesto.atm.entity.ATM;
import com.manifesto.atm.entity.UserAccount;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMServiceImplTest {

    static ATM atm;
    @BeforeAll
    static void initAll() {
         atm = new ATM(8000);
    }

    @Test
    @DisplayName("When balance is retrieval is successful output should be balance")
    void testGetAccountBalanceForGreenPath() {
        ATMService atmService= new ATMServiceImpl();
        final String accountBalance = atmService.getAccountBalance("1234567","1234");
        assertEquals(100,accountBalance);
    }

    @Test
    @DisplayName("When Entered account number is not valid")
    void testGetAccountBalanceForInvalidAccountNumber() {
        ATMService atmService= new ATMServiceImpl();
        final String accountBalance = atmService.getAccountBalance("1234567","1234");
        assertNull(accountBalance);
    }

    @Test
    @DisplayName("When amount withdrawal is successful output should be remaining balance from account")
    void testWithdrawalGreenPath() {
        ATMService atmService= new ATMServiceImpl();
    }

    @Test
    @DisplayName("When account does not hold sufficient balance FUNDS_ERR error should be returned")
    void testWithdrawalForFundsError() {
    }

    @Test
    @DisplayName("When ATM does not hold enough amount ATM_ERR error should be returned")
    void testWithdrawalForATMFundError() {

    }
}