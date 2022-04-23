package com.Bridgelabz;

public class EmpWage {

        static final int WAGE_PER_HOUR = 20;
        static final int Full_DAY_HOUR = 8;
        static final int PART_TIME_HOUR = 4;

       public void fullTime(){
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
            }else {
                System.out.println("Employee is Present");
                dailyEmpWage = WAGE_PER_HOUR * Full_DAY_HOUR;
                System.out.println("Daily Employee Wage is :" + dailyEmpWage);
            }
        }
        public static void main(String[] args) {
             EmpWage emp = new EmpWage();
             emp.fullTime();
        }
}


