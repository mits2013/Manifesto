
## Project 
Manifesto ATM

## Description

This is software for ATM machine. It supports all basic functions done by ATM(Any Time Money). It is Created using Spring boot.

## Installation 
 
 This is maven project in order to run it in your IDE. Import as maven project.
 It supports all standard deployment targets of maven project.
 
To Run from command line use 

```sh
   mvn clean install
   ```
 This will cleanup old files. Compile latest code and build jar file.
 
 Then start Tomcat server embeded in IDE. In intellij it can be run using "Shift+F10" shortcut.
 Or Create Application from "Run/Debug Configuration" dialog and click on run.
 
 Once Tomcat is started on local machine your spring boot application is up and running. To test it check following section. 
 
## Usage:
 
 Once this spring boot application is deployed on web server it will expose following three APIs to users
 
 
 1) GET /setUserAccount/{accountNumber}/{pin}/{accountBalance}/{overDraft}  
    This API is to set user account.
	Ex.:- http://localhost:8080/setUserAccount/87654321/4321/0/0
    
 2) GET /getBalance/{accountNumber}/{pin}  
    This can be used to retrieve user balance once user account is created
	Ex :- http://localhost:8080/getBalance/12345678/1234
 
 3) GET /withdrawAmount/{accountNumber}/{pin}/{withdrawAmount} 
    This API can be used to withdraw balance from user account once it is created
	http://localhost:8080/withdrawAmount/12345678/1234/100

 Error Scenarios of withdrawAmount
     1. If funds aren't available for cash withdrawal the required FUNDS_ERR response will be returned. 
     2. If the ATM is out of cash the required response is ATM_ERR will be returned. 
 
