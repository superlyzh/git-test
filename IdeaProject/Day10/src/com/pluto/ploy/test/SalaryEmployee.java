package com.pluto.ploy.test;

public class SalaryEmployee extends Employee{
      double salary;
     int workDays;
     int leaveDay;

    public SalaryEmployee() {
    }

    public SalaryEmployee(double salary, int workDays, int leaveDay) {
        this.salary = salary;
        this.workDays = workDays;
        this.leaveDay = leaveDay;
    }

    @Override
    public double earning() {
        return salary - salary/workDays * leaveDay;
    }
}
