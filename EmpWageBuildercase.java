package com.EmployeeWage;

public class EmpWageBuildersCase {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int empHours = 0;
        int empWage = 0;
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
            System.out.println("Employee Wage " + empWage);
    }
}

