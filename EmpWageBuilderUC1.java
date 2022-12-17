package com.EmployeeWage;

public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        int FULL_TIME = 1;
        double randomCheck = Math.floor(Math.random() * 10) % 2;
        if(randomCheck == FULL_TIME){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}

