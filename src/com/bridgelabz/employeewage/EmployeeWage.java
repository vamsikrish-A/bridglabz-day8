package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employeeWage system;");

        double Checkout = Math.floor(Math.random() * 10) % 2;
        if (Checkout == 1)
            System.out.println("Employee Present.");
        else
            System.out.println("Employee absent.");
    }
}
