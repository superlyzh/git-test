package com.pluto.ploy.test;

public class Manager extends SalaryEmployee{
    private double commisionPer;

    public Manager(double commisionPer) {
        super();
        this.commisionPer = commisionPer;
    }

    public Manager() {
    }

    @Override
    public double earning() {
        return (salary - salary/workDays *
                leaveDay) * (1 + commisionPer);
    }
}
