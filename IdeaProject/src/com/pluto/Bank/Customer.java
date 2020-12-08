package com.pluto.Bank;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer["+lastName +","+ firstName +"+] has a account:id is "+ account.getId()+
                ", annualInterestRate is "+account.getAnnuallnterestRate()+"%, balance is "+account.getBalance();
    }

}
