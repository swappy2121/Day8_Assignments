package com.Bridgelabz;

public class EmployessAttendence {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        double attendance = Math.floor(Math.random() * 10) % 2;
        if (attendance == 0) {
            System.out.println("employee is absend");
        } else {
            System.out.println("Employee is Present");
        }
    }
    }
}
