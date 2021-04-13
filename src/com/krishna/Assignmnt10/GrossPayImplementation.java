package com.krishna.Assignmnt10;

import java.util.Scanner;

abstract class Employee implements EmployeeInterface{
    public abstract void calculateCommissionRate();
    public abstract void calculateCommission();
}

interface EmployeeInterface{
    public void calculateGrossPay();
    public abstract void displayMonthEndPay();

}

class Salary_Employee extends Employee implements EmployeeInterface{
    public double sales;
    private double commission;
    protected double grossPay;
    protected double commissionRate;
    double advance;

    public Salary_Employee(double sales, double advance) {
        this.sales = sales;
        this.advance = advance;
    }

    public double getSales() {
        return sales;
    }

    public double getCommission() {
        return commission;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getAdvance() {
        return advance;
    }

    @Override
    public void calculateGrossPay() {
        grossPay = commission - advance;
    }

    @Override
    public void calculateCommission() {
        commission = commissionRate * sales / 100;
    }

    @Override
    public void displayMonthEndPay() {
        System.out.println("Commission according to sales : $"+getCommission());
        if(getGrossPay() > 0)
        {
            System.out.println("At the month end, you receive a check of $"+getGrossPay()+" from the company.");
        }
        else if(getGrossPay()<0)
        {
            System.out.println("At the month end, you owe $"+(getGrossPay()*-1)+" to the company.");
        }
        else{
            System.out.println("No Pay Check/ No Debt");
        }
    }

    @Override
    public void calculateCommissionRate() {
        if(sales>=0 &&sales < 10000)
        {
            commissionRate = 5.0;
        }
        else if(sales>=10000 && sales<15000)
        {
            commissionRate = 10.0;
        }
        else if(sales>=15000 && sales < 18000)
        {
            commissionRate = 12.0;
        }
        else if(sales>=18000 && sales < 22000)
        {
            commissionRate = 15.0;
        }
        else if(sales >=22000 )
        {
            commissionRate = 16.0;
        }
        else
        {
            System.out.println("Sales cannot be negative!\nExiting...........");
            System.exit(1);
        }
    }
}

public class GrossPayImplementation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly sales : ");
        double sales = sc.nextDouble();
        System.out.print("Enter advanced pay : ");
        double advance = sc.nextDouble();
        Salary_Employee Salary_Employee = new Salary_Employee(sales,advance);
        Salary_Employee.calculateCommissionRate();
        Salary_Employee.calculateCommission();
        Salary_Employee.calculateGrossPay();
        Salary_Employee.displayMonthEndPay();
        }
    }
