package com.EmployeeWage;

public class EmpWageBuilderCaseWhile {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_NO_OF_HOURS_MONTH =100;

    public static void main(String[] args) {
        int empHours;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while(totalEmpHrs <= MAX_NO_OF_HOURS_MONTH && totalWorkingDays <= NO_OF_WORKING_DAYS ) {
            totalWorkingDays++;
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

            totalEmpHrs = totalEmpHrs + empHours;
            System.out.println("Employee Hours " + totalEmpHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage " + totalEmpWage);
    }
}
