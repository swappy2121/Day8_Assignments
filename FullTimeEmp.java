package com.Bridgelabz;

public class FullTimeEmp {

        static final int WAGE_PER_HOUR = 20;
        static final int Full_DAY_HOUR = 8;

       public void fullTime(){
            int dailyEmpWage;
            double attendance = Math.floor(Math.random() * 10) % 2;

            if (attendance == 0) {
                System.out.println("Employee is Absent");
                dailyEmpWage = 0;
                System.out.println("Daily Employee Wage is :" + dailyEmpWage);
            } else {
                System.out.println("Employee is Present");
                dailyEmpWage = WAGE_PER_HOUR * Full_DAY_HOUR;
                System.out.println("Daily Employee Wage is :" + dailyEmpWage);
            }
        }
        public static void main(String[] args) {
             FullTimeEmp emp = new FullTimeEmp();
             emp.fullTime();
        }

}


