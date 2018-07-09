package com.revature.bankapp_v1;

public class BankAccount {
    String firstName;
    String lastName;
    String ssn;
    float balance;
    double withdraw;
    double deposit;
    long accountNumber;

    BankAccount (){
    }

    BankAccount(String firstName, String lastName, String ssn, float balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;

        System.out.println("Successfully created account for " + firstName + " " + lastName + " " + accountNumber);
        System.out.println(firstName + " " + lastName + ", Balance $" + balance);
    }

    long accountNumber() {
        long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
        return accountNumber;
    }

    public void deposit(float amount) {
    balance = balance + amount;
    System.out.println(firstName + " " + lastName + " deposited $" + deposit + ". Current Balance $" + balance);

    }    

    public void withdraw(float amount) {
        if (balance >= withdraw) {
            balance = balance - amount;
            System.out.println(firstName + " " + lastName + " withdrew $" + withdraw + ". Current Balance $" + balance);
        }
        if (balance < withdraw) {
            System.out.println("Unable to withdraw " + amount + " for " + firstName + " " + lastName + " due to insufficient funds.");
        }
    }

    float displayBalance() {
        return balance;
    }
}