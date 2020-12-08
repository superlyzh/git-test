package com.pluto.Bank;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Jane","Smith");
        Account a =new Account(1000,2000,1.23);

        c.setAccount(a);
        a.deposit(100);
        a.withdraw(960);
        a.withdraw(2000);

        System.out.println(c.toString());

        }
}
