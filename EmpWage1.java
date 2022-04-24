package com.Bridgelabz;

public class EmpWage1 {
    static final int WAGE_PER_HOUR = 20;
    static final int Full_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULL_DAY_PRESENT = 2;
    static final int PART_TIME_PRESENT = 1;
    static final int ABSENT = 0;

    public void FullTimeAndPartTime() {
        int dailyEmpWage;
        double attendance = Math.floor(Math.random() * 10) % 3;

        if (attendance == 0) {
            System.out.println("Employee is Absent");
            dailyEmpWage = 0;
            System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        } else if (attendance == 1) {
            System.out.println("Employee is Present for Part time");
            dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        } else {
            System.out.println("Employee is Present");
            dailyEmpWage = WAGE_PER_HOUR * Full_DAY_HOUR;
            System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        }
    }

    public void SwitchCase() {

        int dailyEmpWage;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case (FULL_DAY_PRESENT):
                System.out.println("Employee is Present for Full time");
                dailyEmpWage = WAGE_PER_HOUR * Full_DAY_HOUR;
                System.out.println("Daily Employee Wage is :" + dailyEmpWage);
                break;

            case (PART_TIME_PRESENT):
                System.out.println("Employee is Present for Part time");
                dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Daily Employee Wage is :" + dailyEmpWage);
                break;

            default:
                System.out.println("Employee is Absent");
                dailyEmpWage = 0;
                System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        }
    }
                 public static void main(String[] args) {
                     EmpWage1 emp = new EmpWage1();
                     emp.FullTimeAndPartTime();
                     emp.SwitchCase();

    }
}



