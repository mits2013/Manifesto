As a user I want to manage ATM transactions.Main purpose is to manage business logic of ATM transactions

### Acceptance Criteria

1. GIVEN: A ATM frontend tries to retrieve user account balance
   WHEN : It calls correct endpoint, pass correct account number and related PIN
   THEN : The ATM frontend should be able to get account balance related to account number.
   
2. GIVEN: A ATM frontend tries to withdraw amount from user account
   WHEN : It calls correct endpoint, pass correct account number, related PIN and acceptable amount*
   THEN : The ATM frontend should be able to get account balance related to account number.

### Criteria

1. If funds aren't available for cash withdrawal the required response is FUNDS_ERR. 
2. If the ATM is out of cash the required response is ATM_ERR.

NOTE:
Accaptable Amount= Amount which does not exceed remaing balance(including overdraft amount)