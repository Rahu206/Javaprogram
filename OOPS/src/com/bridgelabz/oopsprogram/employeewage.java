package com.bridgelabz.oopsprogram;
public class employeewage{
 // Computation //
double empCheck = Math.floor(Math.random()*10) % 2 ;

  public static void main(String[]arg) {
   System.out.println("Welcome to EmployeeWage");
         int IS_FULL_TIME = 1 ;
                     // Computation
            double empCheck = Math.floor(Math.random()*10) % 2 ;
            if (empCheck == IS_FULL_TIME)
           System.out.println("Employee is Present");
            else
          System.out.println("Employee is Absent");
     }
  }
