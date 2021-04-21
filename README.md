
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
 This will cleanup old files. Compile latest code and build jar file ,deploy it on tomcat and start tomcat instance on port 8080.
 
 It can also be run from maven gutter of your IDE.
 
 
## Usage:
 
 Once this spring boot application is deployed on web server it will expose following three APIs to users
 
 
 1) GET /setUserAccount/{accountNumber}/{pin}/{accountBalance}/{overDraft}  (This is to set user account)
 2) GET /getBalance/{accountNumber}/{pin}  (This can be used to retrieve user balance once user account is created)
 3) GET /withdrawAmount/{accountNumber}/{pin}/{withdrawAmount} (This API can be used to withdraw balance from user account once it is created)
 
