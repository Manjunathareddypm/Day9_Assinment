package com.EmployeeWage;

public class EmpWageBuilderCasefor {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int empHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int i=0; i<NO_OF_WORKING_DAYS;i++) {
            int randomCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (randomCheck) {
                case FULL_TIME:
                    empHours = 8;
                    break;
                case PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }

            empWage = EMP_RATE_PER_HOUR * empHours;
            totalEmpWage = empWage * NO_OF_WORKING_DAYS;
            System.out.println("Employee Wage is: " + empWage);
        }
        System.out.println("Employee Wage is: " + totalEmpWage);
    }
}
