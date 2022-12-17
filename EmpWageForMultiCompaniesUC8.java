package com.Day9;

public class EmpWageForMultiCompaniesUC8 {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    public static int refator(String name, int empRatePerHour, int noOfWorkingDays, int maxNoOfHoursMonth) {
        int empHours;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= maxNoOfHoursMonth && totalWorkingDays <= noOfWorkingDays) {
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
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("company name: " + name + " total Employee Wage is= " + totalEmpWage);
        System.out.println();
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageUC9.refator("sbi", 20, 20, 100);
        EmpWageUC9.refator("icici", 25, 22, 120);
    }
}


