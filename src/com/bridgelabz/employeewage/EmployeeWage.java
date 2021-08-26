package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to employeeWage system;");

        int partTime = 1;
        int fullTIme = 2;
        int empHours = 0;

        double Checkout = Math.floor(Math.random() * 10) % 3;
        if (Checkout == fullTIme) {
            System.out.println("Full-time Employee.");
            empHours = FULL_DAY_HOURS;
        }
        else if (Checkout == partTime){
            System.out.println("Part-time Employee.");
            empHours = PART_TIME_HOURS;
        } else {
            System.out.println("Employee Absent.");

            empHours = 0;
        }

        int dailyWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily employee Wage::" +dailyWage);

    }
}
