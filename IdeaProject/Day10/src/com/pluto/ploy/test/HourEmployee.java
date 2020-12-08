package com.pluto.ploy.test;

public class HourEmployee extends Employee {

     double workHour;
     double hourMoney;


    public HourEmployee() {
    }

    public HourEmployee(double workHour, double hourMoney) {
        this.workHour = workHour;
        this.hourMoney = hourMoney;
    }

    @Override
    public double earning() {
     return workHour * hourMoney;
    }
}
