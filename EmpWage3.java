package com.Bridgelabz;

public class EmpWage3 {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULL_DAY_PRESENT = 2;
    static final int PART_TIME_PRESENT = 1;
    static final int ABSENT = 0;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public void SwitchCase() {
        int dailyEmpWage = 0;
        int totalWages = 0;
        int presentDaysFullTime = 0;
        int presentDaysPartTime = 0;
        int absentDays = 0;
        int monthlyWageFullTime = 0;
        int monthlyWagePartTime = 0;
        for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
            int attendance = (int) Math.floor(Math.random() *10)% 3;
            switch (attendance) {
                case (FULL_DAY_PRESENT):
                    dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    presentDaysFullTime = presentDaysFullTime + 1;
                    break;

                case (PART_TIME_PRESENT):
                    dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    presentDaysPartTime = presentDaysPartTime + 1;
                    break;
                default:
                    dailyEmpWage = 0;
                    absentDays = absentDays + 1;
            }
        }
    }
    public void WageForMonth() {
        int dailyEmpWage = 0;
        int totalWages = 0;
        int presentDaysFullTime = 15;
        int presentDaysPartTime = 5;
        int absentDays = 0;
        int monthlyWageFullTime = 0;
        int monthlyWagePartTime = 0;

        monthlyWageFullTime = presentDaysFullTime * WAGE_PER_HOUR * FULL_DAY_HOUR;
        monthlyWagePartTime = presentDaysPartTime * WAGE_PER_HOUR * PART_TIME_HOUR;
        totalWages = (monthlyWageFullTime + monthlyWagePartTime);
        System.out.println("Absent days:" + absentDays + " " + "Fully Present days:" + presentDaysFullTime + " " + "Partly Present days:" + presentDaysPartTime);
        System.out.println("Total monthly wages are : " + totalWages);
    }
                    public static void main(String[] args) {
                         EmpWage3 emp = new EmpWage3();
                         emp.SwitchCase();
                         emp.WageForMonth();
    }

}





