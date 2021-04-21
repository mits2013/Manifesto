package com.manifesto.atm;

import com.manifesto.atm.entity.ATM;
import com.manifesto.atm.entity.UserAccount;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of ATMService
 */
@RestController
public class ATMServiceImpl implements ATMService{

    public static final String FUNDS_ERR = "FUNDS_ERR";
    public static final String ATM_ERR = "ATM_ERR";

    Logger LOGGER = LogManager.getLogger(ATMServiceImpl.class);

    public static Map<String,UserAccount> UserAccountRepository = new HashMap();
    public static ATM atm=new ATM(8000);

    @Override
    @GetMapping("/getBalance/{accountNumber}/{pin}")
    public String getAccountBalance(@PathVariable String accountNumber, @PathVariable String pin) {

        LOGGER.info("Checking balance of account:"+accountNumber);
        //Retrieve account based on account number from repository
        UserAccount userAccount = UserAccountRepository.get(accountNumber);
        // TODO: validate the PIN
        LOGGER.info("validating pin");

        //return balance
        return userAccount.getAccountBalance();
    }

    @Override
    @GetMapping("/withdrawAmount/{accountNumber}/{pin}/{withdrawAmount}")
    public String withdrawal(@PathVariable String accountNumber,@PathVariable String pin,@PathVariable String withdrawAmount) {

        LOGGER.info("Withdrawing money from account:"+accountNumber);

        //Retrieve account from UserRepository
        final UserAccount userAccount = UserAccountRepository.get(accountNumber);

        //validate entered pin against pin from repository

        //check balance against withdrawal amount
        int userAccountBalanceInteger=Integer.parseInt(userAccount.getAccountBalance());
        int overDraftAmountInteger=Integer.parseInt(userAccount.getOverdraftAmount());
        String totalBalance=String.valueOf(userAccountBalanceInteger+overDraftAmountInteger);
        System.out.println("Total eligible balance "+totalBalance);
        //If Total withdrawal amount is exceeding the total balance+ overdraft then return FUNDS_ERR
        Integer integerWithdrawalAmount = Integer.parseInt(withdrawAmount);
        if(Integer.parseInt(totalBalance)< integerWithdrawalAmount)
        {
            LOGGER.error("Error occurred during withdrawal due to low balance in account");
            LOGGER.debug("Low account balance for account "+accountNumber);
            return FUNDS_ERR;
        }else if(atm.getBalance()< integerWithdrawalAmount){
            //If ATM does not have sufficient fund return ATM error
            LOGGER.error("Error occurred during withdrawal due to low balance");
            LOGGER.debug("ATM Balance is"+atm.getBalance());
            return ATM_ERR;
        }else{
            //Deduct from ATM overall balance
            atm.updateBalanceOnWithdrawal(integerWithdrawalAmount);

            //TODO:Deduct from user account balance

            final int remainingBalance = Integer.parseInt(userAccount.getAccountBalance()) - integerWithdrawalAmount;
            return String.valueOf(remainingBalance);
        }
    }

    @GetMapping("/setUserAccount/{accountNumber}/{pin}/{accountBalance}/{overDraft}")
    public String setupAccount(@PathVariable String accountNumber,@PathVariable String pin,@PathVariable String accountBalance,@PathVariable String overDraft  ) {
        UserAccount userAccount=new UserAccount(accountNumber,pin,accountBalance,overDraft);
        UserAccountRepository.put(accountNumber,userAccount);
        System.out.println("Total Accounts :"+UserAccountRepository.size());
        return String.format("Hello %s!", accountNumber+pin);
    }

}
