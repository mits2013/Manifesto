package com.manifesto.atm;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMServiceImplTest {

    @BeforeAll
    static void initAll() {
    }

    @Test
    @DisplayName("When balance is retrieval is successful output should be balance")
    void testGetAccountBalanceForGreenPath() {
    }

    @Test
    @DisplayName("When Entered account number is not valid")
    void testGetAccountBalanceForInvalidAccountNumber() {
    }

    @Test
    @DisplayName("When amount withdrawal is successful output should be remaining balance from account")
    void testWithdrawalGreenPath() {
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