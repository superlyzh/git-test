package com.pluto.Bank;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void withdraw(double amount){
        if(amount <=  balance){
            System.out.println("取款"+amount+"成功!");
            balance-=amount;
        }else{
            System.out.println("抱歉,余额不足!");
        }
    }
    public void deposit(double amount) {
        if(amount>0){
            System.out.println("存款成功"+amount);
            balance+=amount;
        }else{
            System.out.println("输入金额有误");
        }

    }


}
