public class DailyEmpWage {

         public static void main(String args[])  {
         System.out.println("Welcome to EmployeeWage");
       int IS_FULL_TIME = 1;
       int EMP_RATE_PER_HOUR = 20 ;
           //variables
           int empHours = 0;
           int empWages = 0;
                   //Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
             if (empCheck == IS_FULL_TIME)
                  empHours = 8;
              else
                    empHours = 0;
             empWages = empHours * EMP_RATE_PER_HOUR;
             System.out.println("Emp Wage: " + empWages );
    }
  }
