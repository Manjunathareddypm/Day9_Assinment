package com.EmployeeWage;

public class EmpWageBuilderUC2 {
    public static void main(String[] args) {
        int FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        double randomCheck = Math.floor(Math.random() * 10) % 2;
        if(randomCheck == FULL_TIME){
            empHours = 8;
        }
        else {
            empHours = 0;
        }
        empWage = EMP_RATE_PER_HOUR * empHours;
        System.out.println("Employee Wage is: " +empWage );
    }
}
